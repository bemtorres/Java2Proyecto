
INSERT INTO persona VALUES (15456111,'6','Manuel','Alejandro','Salas','Carbajal','Los Alerses','Santiago',8581637,'mansa@correo.com');  
INSERT INTO persona VALUES (15456441,'4','Juan','Alejandro','Saras','Rojas','Los Alerses','Santiago',8581637,'mansa@correo.com'); 
INSERT INTO persona VALUES (15454111,'2','Sebasian','Esteban','Catalan','Orellana','Los Alerses','Santiago',8581637,'mansa@correo.com'); 
INSERT INTO persona VALUES (15876111,'1','Manuel','Sebasian','Galleros','Salamanca','Los Alerses','Santiago',8581637,'mansa@correo.com'); 
INSERT INTO persona VALUES (15434215,'8','Manuel','Esteban','Catalan','Gonzales','Los Alerses','Santiago',8581637,'mansa@correo.com'); 

INSERT INTO persona VALUES (18763311,'7','Mohamed','Isaac','Kalexs','Saaers','Los Alerses','Santiago',8581637,'mansa@correo.com'); 
INSERT INTO persona VALUES (18875413,'5','Miguel','Jose Jesus','Gonzales','Smith','Los Alerses','Santiago',8581637,'mansa@correo.com'); 
INSERT INTO persona VALUES (18544128,'9','Jose','Jesus','Sandobal','Ramirez','Los Alerses','Santiago',8581637,'mansa@correo.com'); 
INSERT INTO persona VALUES (18990123,'3','Lionel','Miguel','San Juan','Dolores','Los Alerses','Santiago',8581637,'mansa@correo.com'); 

INSERT INTO cliente VALUES (15456111,'2017-01-16');
INSERT INTO cliente VALUES (15456441,'2017-02-13');   
INSERT INTO cliente VALUES (15454111,'2017-04-01');   
INSERT INTO cliente VALUES (15876111,'2017-04-01');   
INSERT INTO cliente VALUES (15434215,'2017-09-12');   

INSERT INTO empleado VALUES (18763311,'2017-01-20','Mohamed','1111',45,3100,139500);
INSERT INTO empleado VALUES (18875413,'2017-01-20','Miguel','2222',45,3100,139500);
INSERT INTO empleado VALUES (18544128,'2017-01-20','Jose','3333',45,3100,139500);
INSERT INTO empleado VALUES (18990123,'2017-01-20','Lionel','4444',45,3100,139500);

INSERT INTO vehiculo VALUES ('TH1138',15456111,'HYUNDAI','foto',2011,133,'95');  
INSERT INTO vehiculo VALUES ('RH4536',15456441,'CHEBROLET','foto',1998,133,'95'); 
INSERT INTO vehiculo VALUES ('XP0918',15454111,'MITSUBISHI','foto',2005,133,'95'); 

INSERT INTO vehiculo VALUES ('AA6753',15876111,'KAWASAKI','foto',2002,133,'95'); 
INSERT INTO vehiculo VALUES ('DD48F8',15434215,'YAMAHA','foto',2001,133,'95');

INSERT INTO auto VALUES('TH1138',4,5,'Sedan',1,'NO','NO','NO','NO');
INSERT INTO auto VALUES('RH4536',4,5,'Sedan',1,'NO','NO','NO','NO');
INSERT INTO auto VALUES('XP0918',4,5,'Sedan',1,'NO','NO','NO','NO');

INSERT INTO moto VALUES ('URBANA','AA6753');
INSERT INTO moto VALUES ('MOTOCROSS','DD48F8');

INSERT INTO repuesto VALUES (24500,'estanque de combustible',12000,100,100,'Auto');
INSERT INTO repuesto VALUES (19033,'caja de cambios',12000,100,100,'Auto');
INSERT INTO repuesto VALUES (12567,'estanque de combustible',80000,100,100,'Moto');
INSERT INTO repuesto VALUES (87613,'palanca de cambios',50000,100,100,'Auto');
INSERT INTO repuesto VALUES (90912,'frenos de aire',37950,100,100,'Auto');
INSERT INTO repuesto VALUES (33064,'luz delantera ',13500,100,100,'Moto');
INSERT INTO repuesto VALUES (16738,'bateria de alta duracion',80990,100,100,'Auto');

INSERT INTO estado_ficha VALUES (0,'Terminado');
INSERT INTO estado_ficha VALUES (1,'Ingresado');  
INSERT INTO estado_ficha VALUES (2,'En Espera');  																			
                           																										 															

INSERT INTO fich_reparacion (rut_persona,patente,id_est_fich,fech_ingreso,fech_salida,motivos,detalles,hor_trabajo,total) VALUES (18763311,'TH1138','1115','2017-04-04','2017-04-09','problemas de motor','bateria dañada',2,102000);
INSERT INTO fich_reparacion (rut_persona,patente,id_est_fich,fech_ingreso,fech_salida,motivos,detalles,hor_trabajo,total) VALUES (18875413,'RH4536','1213','2017-03-03','2017-04-09','la caja de cambios no responde','la caja de cambios estaba rota',2,102500);
INSERT INTO fich_reparacion (rut_persona,patente,id_est_fich,fech_ingreso,fech_salida,motivos,detalles,hor_trabajo,total) VALUES (18763311,'XP0918','1328','2017-03-30','2017-04-09','problemas de frenos','frenos sueltos',2,102000);
INSERT INTO fich_reparacion (rut_persona,patente,id_est_fich,fech_ingreso,fech_salida,motivos,detalles,hor_trabajo,total) VALUES (18544128,'AA6753','1415','2017-04-04','2017-04-09','la luz delantera no enciende','luz delantera dañada',2,102000);
INSERT INTO fich_reparacion (rut_persona,patente,id_est_fich,fech_ingreso,fech_salida,motivos,detalles,hor_trabajo,total) VALUES (18990123,'DD48F8','1519','2017-04-04','2017-04-09','estanque de combustible suelto','estanque de combustible suelto y con fuga',2,102000);
