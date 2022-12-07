package com.vinava.pofo.dto.request;

import com.vinava.pofo.model.Cart;
import com.vinava.pofo.model.embed.CartEntity;

import lombok.Data;

import javax.validation.constraints.NotNull;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
public class CartRequest {

    private Long userId;

    @NotNull
    private List<CartEntity> cartEntities;

    public Cart from(long clientId) {
        return Cart.builder()
                .clientId(clientId)
                .userId(this.userId)
                .cartEntities(this.cartEntities)
                .build();
    }


}
