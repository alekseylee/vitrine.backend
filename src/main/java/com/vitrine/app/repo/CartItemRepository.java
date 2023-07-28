package com.vitrine.app.repo;

import com.vitrine.app.model.cart.CartItem;
import com.vitrine.app.model.cart.CartItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository <CartItem, CartItemPK> {
}
