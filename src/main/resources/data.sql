
insert into oauth_client_details (id, client_id, client_secret, scope, authorized_grant_types, authorities, access_token_validity) values (1, 'clientId', '{bcrypt}$2a$10$vCXMWCn7fDZWOcLnIEhmK.74dvK1Eh8ae2WrWlhr2ETPLoxQctN4.', 'read,write', 'password,refresh_token,client_credentials', 'ROLE_CLIENT', 300);

insert into  users (id, email, username, password) VALUES (1, 'user@gmail.com', 'user', '{bcrypt}$2a$10$cyf5NfobcruKQ8XGjUJkEegr9ZWFqaea6vjpXWEaSqTa2xL9wjgQC');

insert into users (id, email, username, password) VALUES (2, 'guest@gmail.com', 'guest', '{bcrypt}$2a$10$cyf5NfobcruKQ8XGjUJkEegr9ZWFqaea6vjpXWEaSqTa2xL9wjgQC');

insert into authorities (id, username, authority) VALUES (1, 'user', 'ROLE_USER');

insert into authorities (id, username, authority) VALUES (2, 'guest', 'ROLE_GUEST');
