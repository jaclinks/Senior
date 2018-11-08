/* Database: SqlServer. Generation date: 2018-11-06 21:32:07:370 */
/* Entity ClienteEntity */
create table cliente (
	id VARCHAR(255),
	nome VARCHAR(255) NOT NULL,
	data_nascimento DATE NOT NULL /* dataNascimento */,
	credito_habilitado BIT /* creditoHabilitado */,
	cpf VARCHAR(255) NOT NULL,
	ext VARCHAR(4000)
);



/* Join Tables */

/* Primary Key Constraints */
alter table cliente add constraint pk_cliente_id primary key(id);

/* Foreign Key Constraints */

/* Unique Key Constraints */
