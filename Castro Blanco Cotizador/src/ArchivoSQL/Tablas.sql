
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
	amortozacion float not null,
	patente varchar (20) not null,
	constraint pk_costo_financiero primary key (nombre,patente),
	constraint fk_financiero_camion foreign key (patente) references Camiones (patente)
)

/* ----------------------------- */
/* --- TABLA DE COTIZACIONES --- */
/* ----------------------------- */

CREATE TABLE Cotizaciones
(
	nroCotizacion int not null,
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
	nroOrdenViaje int not null identity (1,1),
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
	nroViaje int not null identity (1,1),
	nroCotizacion int not null,
	paisOrigen varchar (20) not null,
	proviciaOrigen	varchar (20) not null,
	ciudadOrigen varchar (20) not null,
	direccionOrigen	varchar (20) not null,
	paisDestino varchar (20) not null,
	proviciaDestino	varchar (20) not null,
	ciudadDestino varchar (20) not null,
	direccionDestino varchar (20) not null,	
	fechaSalida datetime not null,
	fechaLlegada datetime not null,
	distancia int not null,
	mercaderia varchar (20) not null,
	camionViaje varchar (20) not null,	-- patente
	choferViaje	int not null,			-- documento
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




SELECT * FROM Clientes
SELECT * FROM Camiones
SELECT * FROM CostosFijos
SELECT * FROM CostosVariables

INSERT INTO Camiones VALUES ('FED-925','Ford','SE1200',10,15)
INSERT INTO Camiones VALUES ('ETG-108','Volskwagen','RX1300',10,12)
INSERT INTO Camiones VALUES ('GXE-325','Renault','TGZ20',12,10)

INSERT INTO CostosFijos VALUES ('Satelital','20091111',120,'FED-925')
INSERT INTO CostosFijos VALUES ('Sseguro','20091111',160,'FED-925')

SELECT cam.patente , cam.marca , cam.modelo , cfij.nombre as 'costo' , cfij.valor
FROM Camiones cam
INNER JOIN CostosFijos cfij
ON cam.patente = cfij.patente
ORDER BY cam.patente , cfij.nombre
