package com.bookstore.repository;

import com.bookstore.domain.CartItem;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

import com.bookstore.domain.BookToCartItem;

@Transactional
public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {

    void deleteByCartItem(CartItem cartItem);
}
