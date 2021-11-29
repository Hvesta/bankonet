
/*CREATE TABLE client (
    id INT UNSIGNED AUTO_INCREMENT,
    lastname VARCHAR(50) NOT NULL,
    firstname VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    phone CHAR(10) NOT NULL,
    CONSTRAINT pk_client PRIMARY KEY (id)
);




CREATE TABLE spendingAccount (
    spending_id INT UNSIGNED AUTO_INCREMENT,
    spending_name VARCHAR(100) NOT NULL,
    spending_amount DECIMAL(12 , 2 ) NOT NULL,
    spending_credit DECIMAL(6 , 2 ) NOT NULL,
    client_id INT UNSIGNED UNIQUE,
    CONSTRAINT pk_spendingAccount PRIMARY KEY (spending_id),
    CONSTRAINT fk_spendingAccount FOREIGN KEY (client_id)
        REFERENCES client (id)
);





CREATE TABLE savingAccount (
    saving_id INT UNSIGNED AUTO_INCREMENT,
    saving_name VARCHAR(100) NOT NULL,
    saving_amount DECIMAL(12 , 2 ) NOT NULL,
    saving_interest DECIMAL(4 , 2 ) NOT NULL,
    saving_minimum DECIMAL(4 , 2 ) NOT NULL,
    client_id INT UNSIGNED,
    CONSTRAINT pk_savingAccount PRIMARY KEY (saving_id),
    CONSTRAINT fk_savingAccountt FOREIGN KEY (client_id)
        REFERENCES client (id)
);

insert into client (lastname, firstname, email, phone)
values ("Doe", "John", "johndoe@gmail.com", "0101010101");

insert into client (lastname, firstname, email, phone)
values ("Doe", "Jane", "janedoe@gmail.com", "0201010101");


insert into spendingAccount (spending_name, spending_amount, spending_credit, client_id)
values ("spending", 1500, 500, 2);

insert into spendingAccount (spending_name, spending_amount, spending_credit, client_id)
values ("to spend", 100, 20,1);



insert into savingAccount (saving_name, saving_amount, saving_interest ,saving_minimum, client_id)
values ("savings", 10000, 1.2, 50, 2);

*/

    