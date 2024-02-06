CREATE TABLE cart (
    id BIGINT GENERATED ALWAYS AS IDENTITY,

    PRIMARY KEY (id)
);

CREATE TABLE product (
    id BIGINT GENERATED ALWAYS AS IDENTITY,
    name varchar(255) NOT NULL,
    quantity INT NOT NULL,
    cart_id BIGINT,

    PRIMARY KEY (id),
    FOREIGN KEY (cart_id) REFERENCES cart (id)
);