# shopping-cart
Seed repository for implementing shopping cart using spring boot

# Pre-requisites
- Jdk 21
- Docker
- Git cli

# Use cases to build
- Adding Items: Allows users to add items to their shopping cart.
- Viewing the Cart: Enables users to view all the items they have added to their cart.
- Updating Item Quantity: Allows users to change the quantity of a specific item in their cart.
- Removing Items: Enables users to remove items from their cart.
- Applying Coupon Codes: Allows users to apply a coupon code to their cart to avail discounts.
- Checkout: Allows users to finalize their order and proceed to payment.

# Local setup
The bundled docker compose has postgres added. To start use
```
docker-compose up
```

To start spring boot app locally use
```
./gradlew clean bootRun
```