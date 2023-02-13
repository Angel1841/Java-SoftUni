package com.softuni.jsonexercise.Services.UserService;

import com.softuni.jsonexercise.Domain.DTOS.Users.UserDTO;
import com.softuni.jsonexercise.Domain.DTOS.Users.UserWithProductDTO;
import com.softuni.jsonexercise.Domain.DTOS.Users.UsersWithSoldProductsDTO;
import com.softuni.jsonexercise.Domain.DTOS.Users.wrappers.UsersWithProductsWrapperDto;
import com.softuni.jsonexercise.Repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

import static com.softuni.jsonexercise.Constants.Paths.USERS_AND_PRODUCTS_JSON_PATH;
import static com.softuni.jsonexercise.Constants.Paths.USERS_SOLD_PRODUCTS_PATH;
import static com.softuni.jsonexercise.Constants.UTILS.MODEL_MAPPER;
import static com.softuni.jsonexercise.Constants.UTILS.writeJsonIntoFile;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UsersWithSoldProductsDTO> findAllBySellingProductsBuyerIsNotNullOrderBySellingProductsBuyerFirstName() throws IOException {
        final List<UsersWithSoldProductsDTO> usersWithSoldProductsDTOS = this.userRepository.findAllBySellingProductsBuyerIsNotNullOrderBySellingProductsBuyerFirstName()
                .orElseThrow(NoSuchElementException::new)
                .stream()
                .map(user -> MODEL_MAPPER.map(user, UsersWithSoldProductsDTO.class))
                .collect(Collectors.toList());

        writeJsonIntoFile(usersWithSoldProductsDTOS, USERS_SOLD_PRODUCTS_PATH);

        return usersWithSoldProductsDTOS;
    }

    @Override
    public UsersWithProductsWrapperDto usersAndProducts() throws IOException {

        final List<UserWithProductDTO> usersAndProducts = this.userRepository
                .findAllBySellingProductsBuyerIsNotNullOrderBySellingProductsBuyerFirstName()
                .orElseThrow(NoSuchElementException::new)
                .stream()
                .map(user -> MODEL_MAPPER.map(user, UserDTO.class))
                .map(UserDTO::toUserWithProductsDto)
                .collect(Collectors.toList());

        final UsersWithProductsWrapperDto usersWithProductsWrapperDto = new UsersWithProductsWrapperDto(usersAndProducts);

        writeJsonIntoFile(usersWithProductsWrapperDto, USERS_AND_PRODUCTS_JSON_PATH);

        return usersWithProductsWrapperDto;
    }
}
