insert into GRUPO_ATENDIMENTO (ID_GRUPO_ATENDIMENTO,NM_GRUPO_ATENDIMENTO,ST_ATIVO,ID_CATEGORIA) values (1,'PGR/CENAR - Suporte nacional de primeiro nível',1,1);
insert into GRUPO_ATENDIMENTO (ID_GRUPO_ATENDIMENTO,NM_GRUPO_ATENDIMENTO,ST_ATIVO,ID_CATEGORIA) values (2,'PR-CE/SEART - Atendimento de primeiro nível',1,1);
insert into GRUPO_ATENDIMENTO (ID_GRUPO_ATENDIMENTO,NM_GRUPO_ATENDIMENTO,ST_ATIVO,ID_CATEGORIA) values (3,'SIADS/NDS6 - Sustentação de sistemas',1,4);
insert into GRUPO_ATENDIMENTO (ID_GRUPO_ATENDIMENTO,NM_GRUPO_ATENDIMENTO,ST_ATIVO,ID_CATEGORIA) values (4,'SUBSEC/CDMSEC - Segurança Cibernética',1,3);
insert into GRUPO_ATENDIMENTO (ID_GRUPO_ATENDIMENTO,NM_GRUPO_ATENDIMENTO,ST_ATIVO,ID_CATEGORIA) values (5,'SUBDIG/COAD - Administração de dados',1,7);
insert into GRUPO_ATENDIMENTO (ID_GRUPO_ATENDIMENTO,NM_GRUPO_ATENDIMENTO,ST_ATIVO,ID_CATEGORIA) values (6,'SUBINF/COAPLI - Infraestrutura de aplicações',1,8);

insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (1,1,1);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (2,1,2);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (3,1,3);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (4,2,1);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (5,2,2);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (6,2,3);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (7,3,8);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (8,3,9);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (9,4,11);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (10,4,4);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (11,5,12);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (12,6,13);
insert into ITEM_GRUPO_ATENDIMENTO (ID_ITEM_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_SERVICO) values (13,6,14);

insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (1,1,11,to_date('15/04/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (2,1,17,to_date('25/05/2024','DD/MM/YYYY'),to_date('31/12/2025','DD/MM/YYYY'));
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (3,1,22,to_date('29/10/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (4,1,29,to_date('30/11/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (5,1,31,to_date('01/03/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (6,1,43,to_date('03/04/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (7,2,48,to_date('10/02/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (8,2,20,to_date('23/04/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (9,2,52,to_date('13/05/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (10,3,62,to_date('01/05/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (11,3,72,to_date('01/10/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (12,3,86,to_date('15/11/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (13,4,90,to_date('10/03/2023','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (14,4,95,to_date('18/08/2022','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (15,4,100,to_date('08/11/2021','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (16,5,110,to_date('25/01/2023','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (17,5,113,to_date('13/07/2024','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (18,6,117,to_date('15/06/2023','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (19,6,121,to_date('23/10/2021','DD/MM/YYYY'),null);
insert into USUARIO_GRUPO_ATENDIMENTO (ID_USUARIO_GRUPO_ATENDIMENTO,ID_GRUPO_ATENDIMENTO,ID_USUARIO,DT_INICIO,DT_FIM) values (20,6,125,to_date('03/09/2022','DD/MM/YYYY'),null);
