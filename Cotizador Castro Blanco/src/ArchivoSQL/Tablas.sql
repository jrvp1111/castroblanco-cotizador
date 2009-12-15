
/* ------------------------- */
/* --- TABLA DE CHOFERES --- */
/* ------------------------- */

CREATE TABLE Choferes
(
	dni int not null,
	nombre varchar (30) not null,
	apellido varchar (30) not null,
	direccion varchar (50) not null,
	telefono varchar (20) not null,
	nextel varchar (20) null,
	constraint pk_chofer primary key (dni)
)

/* ------------------------- */
/* --- TABLA DE CAMIONES --- */
/* ------------------------- */

CREATE TABLE Camiones
(
	patente varchar (20) not null,
	marca varchar (20) not null,
	modelo varchar (20) not null,
	cantPallets int not null,
	consumoCombustible float not null,			-- unidad en litros cada 100 km
	constraint pk_camion primary key (patente)
)	

/* ------------------------- */
/* --- TABLA DE CLIENTES --- */
/* ------------------------- */

CREATE TABLE Clientes
(
	tipoId char (5) not null,
	numeroId int not null,
	nombre varchar (20) not null,
	apellido varchar (20) not null,
	email varchar (40) not null,
	razonSocial varchar(40) not null,
	constraint pk_cliente primary key (tipoId , numeroId)
)

/* ----------------------------- */
/* --- TABLA DE COSTOS FIJOS --- */
/* ----------------------------- */

CREATE TABLE CostosFijos
(
	nombre varchar (20) not null,
	actualizacion datetime not null,
	valor float not null,
	patente varchar (20) not null,
	constraint pk_costo_fijo primary key (nombre,patente),
	constraint fk_fijo_camion foreign key (patente) references Camiones (patente)
)

/* --------------------------------- */
/* --- TABLA DE COSTOS VARIABLES --- */
/* --------------------------------- */

CREATE TABLE CostosVariables
(
	nombre varchar (20) not null,
	actualizacion datetime not null,
	precio float not null,
	duracion float not null,
	cantidad int not null,
	patente varchar (20) not null,
	constraint pk_costo_variable primary key (nombre,patente),
	constraint fk_variable_camion foreign key (patente) references Camiones (patente)
)

/* ----------------------------------- */
/* --- TABAL DE COSTOS FINANCIEROS --- */
/* ----------------------------------- */

CREATE TABLE CostosFinancieros
(
	nombre varchar (20) not null,
	depreciacion float not null,
	valorUnidad float not null,
	vidaUtil int not null,
	patente varchar (20) not null,
	constraint pk_costo_financiero primary key (nombre,patente),
	constraint fk_financiero_camion foreign key (patente) references Camiones (patente)
)

/* ----------------------------- */
/* --- TABLA DE COTIZACIONES --- */
/* ----------------------------- */

CREATE TABLE Cotizaciones
(
	nroCotizacion int not null identity (1000,1),
	costoOperativo float not null,
	estado bit not null,
	fechaEmision datetime not null,
	precioVenta float not null,
	cliTipoId char (5) not null,
	cliNumeroId int not null,
	constraint pk_cotizacion primary key (nroCotizacion),
	constraint fk_coti_cliente foreign key (cliTipoId,cliNumeroId) references Clientes (tipoId,numeroId)
)

/* ----------------------------- */
/* --- TABLA DE COSTOS MACRO --- */
/* ----------------------------- */

CREATE TABLE CostosMacro
(
	nombre varchar (20) not null,
	actualizacion datetime not null,
	valor float not null,
	constraint pk_costo_macro primary key (nombre)
)

/* --------------------------------- */
/* --- TABLA DE ORDENES DE VIAJE --- */
/* --------------------------------- */

CREATE TABLE OrdenesViajes
(
	nroOrdenViaje int not null identity (1000,1),
	nroCotizacion int not null,
	fechaEmision datetime not null,
	observaciones varchar (50) null,
	constraint pk_orden_viaje primary key (nroOrdenViaje,nroCotizacion),
	constraint fk_ordenViaje_cotiz foreign key (nroCotizacion) references Cotizaciones (nroCotizacion)
)

/* ----------------------- */
/* --- TABLA DE VIAJES --- */
/* ----------------------- */

CREATE TABLE Viajes
(
	nroViaje int not null identity (1000,1),
	nroCotizacion int not null,
	paisOrigen varchar (20) not null,
	provinciaOrigen	varchar (20) not null,
	ciudadOrigen varchar (20) not null,
	direccionOrigen	varchar (20) not null,
	paisDestino varchar (20) not null,
	provinciaDestino varchar (20) not null,
	ciudadDestino varchar (20) not null,
	direccionDestino varchar (20) not null,	
	fechaSalida datetime not null,
	fechaLlegada datetime not null,
	distancia int not null,
	mercaderia varchar (200) not null,
	camionViaje varchar (20) not null,	-- patente
	choferViaje int not null,		-- documento
	constraint pk_viaje primary key (nroViaje),
	constraint fk_viaje_cotiz foreign key (nroCotizacion) references Cotizaciones (nroCotizacion),
	constraint fk_viaje_camion foreign key (camionViaje) references Camiones (patente),
	constraint fk_viaje_chofer foreign key (choferViaje) references Choferes (dni),
)

/* ------------------------------------------------ */
/* --- TABLA DE RELACION COSTOS MACRO --> VIAJE --- */
/* ------------------------------------------------ */

CREATE TABLE ViajesCostosMacro
(
	nroViaje int not null,
	nombre varchar (20) not null,
	constraint pk_viajecostomacro primary key (nroViaje,nombre),
	constraint fk_viajecostomacro_viaje foreign key (nroViaje) references Viajes (nroViaje),
	constraint fk_viajecostomacro_costomacro foreign key (nombre) references CostosMacro (nombre)
)

/* ---------------------------- */
/* --- TABLA DE COSTO VIAJE --- */
/* ---------------------------- */

CREATE TABLE CostoViaje
(
	nombre varchar (20) not null,
	valor float not null,
	nroViaje int not null,
	constraint pk_coto_viaje primary key (nombre),
	constraint fk_costo_viaje foreign key (nroViaje) references Viajes (nroViaje)
)

/* ------------------------- */
/* --- TABLA DE USUARIOS --- */
/* ------------------------- */

CREATE TABLE Usuarios
(
    nombreUsuario varchar (40) not null,
    contrasenia varchar (40) not null,
    constraint pk_nombre_usuario primary key (nombreUsuario)
)

/* ------------------------------------- */
/* --- TABLA DE PERMISOS POR USUARIO --- */
/* ------------------------------------- */

CREATE TABLE UsuariosPermisos
(
	nombreUsuario varchar (40) not null,
	permiso varchar (40) not null,
	constraint pk_permiso_usuario primary key (nombreUsuario,permiso),
	constraint fk_permiso_usuario foreign key (nombreUsuario) references Usuarios (nombreUsuario)
)


/* --- CARGA DE DATOS --- */

INSERT INTO Camiones VALUES ('FED-925','Ford','SE1200',10,15)
INSERT INTO Camiones VALUES ('ETG-108','Volskwagen','RX1300',10,12)
INSERT INTO Camiones VALUES ('GXE-325','Renault','TGZ20',12,10)

INSERT INTO Choferes VALUES (30618628 , 'Juan' , 'Perez' , '9 de julio 3253' , '4135-4820' , '553*4884')
INSERT INTO Choferes VALUES (29318682 , 'Damian' , 'Gomez' , '25 de mayo 285' , '4281-9544' , '208*39635')

INSERT INTO Usuarios VALUES ('TomasCereminati' , 'tc')
INSERT INTO Usuarios VALUES ('ColoCastro' , 'cc')

INSERT INTO Clientes VALUES ('CUIL' , 34079773 , 'Tomas' , 'Cereminati' , 'tcereminati@hotmail.com' , 'Lacer S.H.')
INSERT INTO Clientes VALUES ('CUIT' , 12345678 , 'Nazareno' , 'Pesado' , 'npesado@gmail.com' , 'ZonalShop')

INSERT INTO CostosFijos VALUES ('Satelital' , '20091211' , 170 , 'FED-925')
INSERT INTO CostosFijos VALUES ('Seguro' , '20091210' , 240 , 'FED-925')
INSERT INTO CostosFijos VALUES ('Patente' , '20091211' , 85 , 'FED-925')

INSERT INTO CostosFijos VALUES ('Satelital' , '20091211' , 190 , 'ETG-108')
INSERT INTO CostosFijos VALUES ('Seguro' , '20091210' , 210 , 'ETG-108')
INSERT INTO CostosFijos VALUES ('Patente' , '20091211' , 90 , 'ETG-108')

INSERT INTO CostosFijos VALUES ('Satelital' , '20091211' , 250 , 'GXE-325')
INSERT INTO CostosFijos VALUES ('Seguro' , '20091210' , 300 , 'GXE-325')
INSERT INTO CostosFijos VALUES ('Patente' , '20091211' , 120 , 'GXE-325')

INSERT INTO CostosVariables VALUES ('Filtro Nafta' , '20091210' , 80 , 10000 , 1 , 'FED-925')
INSERT INTO CostosVariables VALUES ('Filtro Aceite' , '20091210' , 120 , 15000 , 1 , 'FED-925')
INSERT INTO CostosVariables VALUES ('Neumatico Direc' , '20091210' , 280 , 30000 , 2 , 'FED-925')

INSERT INTO CostosVariables VALUES ('Filtro Nafta' , '20091210' , 100 , 12000 , 1 , 'ETG-108')
INSERT INTO CostosVariables VALUES ('Filtro Aceite' , '20091210' , 150 , 18000 , 1 , 'ETG-108')
INSERT INTO CostosVariables VALUES ('Neumatico Direc' , '20091210' , 330 , 30000 , 2 , 'ETG-108')

INSERT INTO CostosVariables VALUES ('Filtro Nafta' , '20091210' , 60 , 9000 , 1 , 'GXE-325')
INSERT INTO CostosVariables VALUES ('Filtro Aceite' , '20091210' , 95 , 12000 , 1 , 'GXE-325')
INSERT INTO CostosVariables VALUES ('Neumatico Direc' , '20091210' , 250 , 28000 , 2 , 'GXE-325')

INSERT INTO CostosFinancieros VALUES ('Amortizacion' , 30 , 160000 , 5 , 'FED-925')
INSERT INTO CostosFinancieros VALUES ('Amortizacion' , 25 , 140000 , 6 , 'ETG-108')
INSERT INTO CostosFinancieros VALUES ('Amortizacion' , 20 , 190000 , 7 , 'GXE-325')