-- Generado por Oracle SQL Developer Data Modeler 4.1.5.907
--   en:        2017-10-27 15:51:11 GMT-04:00
--   sitio:      Oracle Database 11g
--   tipo:      Oracle Database 11g


CREATE Database empresa;
use empresa;

CREATE TABLE auto
  (
    patente VARCHAR (10) NOT NULL ,
    cant_puertas INT NOT NULL ,
    asientos     INT NOT NULL ,
    tipo_auto VARCHAR (30) NOT NULL ,
    cant_airbag INT NOT NULL ,
    camb_automatico VARCHAR (30) NOT NULL ,
    electrico VARCHAR (30) NOT NULL ,
    dire_asistid VARCHAR (30) NOT NULL ,
    port_equip VARCHAR (30) NOT NULL
  ) ;



CREATE TABLE cliente
  (
    rut_persona     INT NOT NULL ,
    fech_asociacion DATE NOT NULL
  ) ;



CREATE TABLE det_fich_repuesto
  (
    id_ficha    INT NOT NULL ,
    repuesto_id INT NOT NULL ,
    cantidad    INT NOT NULL ,
    total       INT NOT NULL
  ) ;



CREATE TABLE empleado
  (
    rut_persona INT NOT NULL ,
    fech_contra DATE NOT NULL ,
    usuario VARCHAR (30) NOT NULL ,
    clave VARCHAR (30) NOT NULL ,
    hor_trabo INT NOT NULL ,
    val_hora  INT NOT NULL ,
    sueldo    INT NOT NULL
  ) ;



CREATE TABLE estado_ficha
  (
    id_est_fich INT NOT NULL ,
    nom_est_fich VARCHAR (30) NOT NULL
  ) ;



CREATE TABLE fich_reparacion
  (
    id_ficha    INT NOT NULL AUTO_INCREMENT,
    rut_persona INT NOT NULL ,
    patente VARCHAR (10) NOT NULL ,
    id_est_fich  INT NOT NULL ,
    fech_ingreso DATE NOT NULL ,
    fech_salida  DATE NOT NULL ,
    motivos VARCHAR (250) NOT NULL ,
    detalles VARCHAR (250) NOT NULL ,
    hor_trabajo INT NOT NULL ,
    total       INT NOT NULL,
    PRIMARY KEY (id_ficha)
  ) ;



CREATE TABLE moto
  (
    tip_moto VARCHAR (30) NOT NULL ,
    vehiculo_patente VARCHAR (10) NOT NULL
  ) ;


CREATE TABLE persona
  (
    rut_persona INT NOT NULL ,
    dv_per VARCHAR(1) NOT NULL ,
    p_nombre VARCHAR (30) NOT NULL ,
    s_nombre VARCHAR (30) NOT NULL ,
    ap_pater VARCHAR (30) NOT NULL ,
    ap_mater VARCHAR (30) NOT NULL ,
    direccion VARCHAR (30) NOT NULL ,
    comuna VARCHAR (30) NOT NULL ,
    telefono INT NOT NULL ,
    email VARCHAR (30) NOT NULL
  ) ;



CREATE TABLE repuesto
  (
    repuesto_id INT NOT NULL ,
    nom_repues VARCHAR (30) NOT NULL ,
    precio   INT NOT NULL ,
    cantidad INT NOT NULL ,
    stock    INT NOT NULL ,
    tip_vehiculo VARCHAR (30) NOT NULL
  ) ;



CREATE TABLE vehiculo
  (
    patente VARCHAR (10) NOT NULL ,
    rut_persona INT NOT NULL ,
    marca VARCHAR (30) NOT NULL ,
    foto VARCHAR (30) NOT NULL ,
    anyo        INT NOT NULL ,
    kilometraje INT NOT NULL ,
    tip_bencina VARCHAR (30) NOT NULL
  ) ;

ALTER TABLE auto ADD CONSTRAINT auto_PK PRIMARY KEY ( patente ) ;
ALTER TABLE cliente ADD CONSTRAINT cliente_PK PRIMARY KEY ( rut_persona ) ;
ALTER TABLE det_fich_repuesto ADD CONSTRAINT det_fich_repuesto_PK PRIMARY KEY ( id_ficha ) ;
ALTER TABLE empleado ADD CONSTRAINT empleado_PK PRIMARY KEY ( rut_persona ) ;
ALTER TABLE estado_ficha ADD CONSTRAINT estado_ficha_PK PRIMARY KEY ( id_est_fich ) ;
ALTER TABLE persona ADD CONSTRAINT persona_PK PRIMARY KEY ( rut_persona ) ;
ALTER TABLE repuesto ADD CONSTRAINT repuesto_PK PRIMARY KEY ( repuesto_id ) ;
ALTER TABLE vehiculo ADD CONSTRAINT vehiculo_PK PRIMARY KEY ( patente ) ;


ALTER TABLE auto ADD CONSTRAINT aut_veh_FK FOREIGN KEY ( patente ) REFERENCES vehiculo ( patente ) ;

ALTER TABLE cliente ADD CONSTRAINT cli_per_FK FOREIGN KEY ( rut_persona ) REFERENCES persona ( rut_persona ) ;

ALTER TABLE det_fich_repuesto ADD CONSTRAINT detfichrep_fichrep_FK FOREIGN KEY ( id_ficha ) REFERENCES fich_reparacion ( id_ficha ) ;

ALTER TABLE det_fich_repuesto ADD CONSTRAINT detfichrep_rep_FK FOREIGN KEY ( repuesto_id ) REFERENCES repuesto ( repuesto_id ) ;

ALTER TABLE empleado ADD CONSTRAINT emp_per_FK FOREIGN KEY ( rut_persona ) REFERENCES persona ( rut_persona ) ;

ALTER TABLE fich_reparacion ADD CONSTRAINT fic_rep_est_fic_FK FOREIGN KEY ( id_est_fich ) REFERENCES estado_ficha ( id_est_fich ) ;

ALTER TABLE fich_reparacion ADD CONSTRAINT fic_rep_ve_FK FOREIGN KEY ( patente ) REFERENCES vehiculo ( patente ) ;

ALTER TABLE fich_reparacion ADD CONSTRAINT fich_rep_emp_FK FOREIGN KEY ( rut_persona ) REFERENCES empleado ( rut_persona ) ;

ALTER TABLE moto ADD CONSTRAINT mot_veh_FK FOREIGN KEY ( vehiculo_patente ) REFERENCES vehiculo ( patente ) ;

ALTER TABLE vehiculo ADD CONSTRAINT veh_cli_FK FOREIGN KEY ( rut_persona ) REFERENCES cliente ( rut_persona ) ;


-- Informe de Resumen de Oracle SQL Developer Data Modeler: 
-- 
-- CREATE TABLE                            10
-- CREATE INDEX                             0
-- ALTER TABLE                             19
-- CREATE VIEW                              0
-- ALTER VIEW                               0
-- CREATE PACKAGE                           0
-- CREATE PACKAGE BODY                      0
-- CREATE PROCEDURE                         0
-- CREATE FUNCTION                          0
-- CREATE TRIGGER                           0
-- ALTER TRIGGER                            0
-- CREATE COLLECTION TYPE                   0
-- CREATE STRUCTURED TYPE                   0
-- CREATE STRUCTURED TYPE BODY              0
-- CREATE CLUSTER                           0
-- CREATE CONTEXT                           0
-- CREATE DATABASE                          0
-- CREATE DIMENSION                         0
-- CREATE DIRECTORY                         0
-- CREATE DISK GROUP                        0
-- CREATE ROLE                              0
-- CREATE ROLLBACK SEGMENT                  0
-- CREATE SEQUENCE                          0
-- CREATE MATERIALIZED VIEW                 0
-- CREATE SYNONYM                           0
-- CREATE TABLESPACE                        0
-- CREATE USER                              0
-- 
-- DROP TABLESPACE                          0
-- DROP DATABASE                            0
-- 
-- REDACTION POLICY                         0
-- 
-- ORDS DROP SCHEMA                         0
-- ORDS ENABLE SCHEMA                       0
-- ORDS ENABLE OBJECT                       0
-- 
-- ERRORS                                   0
-- WARNINGS                                 0
