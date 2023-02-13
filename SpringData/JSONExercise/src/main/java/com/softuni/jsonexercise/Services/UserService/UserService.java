package com.softuni.jsonexercise.Services.UserService;

import com.softuni.jsonexercise.Domain.DTOS.Users.UsersWithSoldProductsDTO;
import com.softuni.jsonexercise.Domain.DTOS.Users.wrappers.UsersWithProductsWrapperDto;
import com.softuni.jsonexercise.Domain.Entities.User;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UsersWithSoldProductsDTO> findAllBySellingProductsBuyerIsNotNullOrderBySellingProductsBuyerFirstName() throws IOException;

    UsersWithProductsWrapperDto usersAndProducts() throws IOException;

}
