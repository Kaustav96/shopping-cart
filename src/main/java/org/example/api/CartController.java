package org.example.api;

import java.util.List;
import java.util.Optional;
import org.example.api.dao.CartProduct;
import org.example.domain.Cart;
import org.example.domain.Product;
import org.example.domain.service.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cart")
public class CartController {

  @Autowired private CartRepository cartRepository;

  @PostMapping("/{id}")
  public ResponseEntity addProductToCart(@PathVariable Long id, @RequestBody CartProduct addProductRequest) {
    Product product = new Product(addProductRequest.getProductName(), addProductRequest.getCount());
    Optional<Cart> mayBeCart = this.cartRepository.findById(id);
    if(mayBeCart.isEmpty()) {
      Cart cart  = new Cart(List.of(product));
      this.cartRepository.save(cart);
    } else {
      Cart cart = mayBeCart.get();
      cart.getProducts().add(product);
      this.cartRepository.save(cart);
    }
    return ResponseEntity.noContent().build();
  }
}
