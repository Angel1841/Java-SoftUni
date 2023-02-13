package com.softuni.jsonexercise.Domain.DTOS.Users.wrappers;

import com.softuni.jsonexercise.Domain.DTOS.Users.UserWithProductDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UsersWithProductsWrapperDto {

    private Integer count;

    private List<UserWithProductDTO> users;

    public UsersWithProductsWrapperDto(List<UserWithProductDTO> users) {
        this.users = users;
        this.count = users.size();
    }

}
