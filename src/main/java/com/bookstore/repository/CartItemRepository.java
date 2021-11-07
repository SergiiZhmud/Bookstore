package com.bookstore.repository;

import java.util.List;

import com.bookstore.domain.Order;
import org.springframework.data.repository.CrudRepository;

import com.bookstore.domain.CartItem;
import com.bookstore.domain.ShoppingCart;

import javax.transaction.Transactional;

@Transactional
public interface CartItemRepository extends CrudRepository<CartItem, Long>{
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);


    CartItem findAllById(Long id);

    List<CartItem> findByOrder(Order order);
}
