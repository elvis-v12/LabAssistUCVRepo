CREATE DATABASE BD_Gestion_Laboratorios;
GO

USE BD_Gestion_Laboratorios;
GO

--Almacena datos de cadena de tamaño variable
-----TABLAS:
CREATE TABLE Estudiante ( 
	Estudiante_Codigo INT PRIMARY KEY IDENTITY,
	Estudiante_Nombres VARCHAR(100),
	Estudiante_Apellidos VARCHAR(100),
	Estudiante_Email VARCHAR(100),
	Estudiante_QR VARCHAR(300),
	Estudiante_Imagen_Rostro VARCHAR(500),
	Estudiante_Carrera_Profesional VARCHAR(100),
	Estudiante_Estado VARCHAR(50) 
)
GO

CREATE TABLE Profesor ( 
	Profesor_Codigo INT PRIMARY KEY IDENTITY,
	Profesor_Nombres VARCHAR(100),
	Profesor_Apellidos VARCHAR(100),
	Profesor_Email VARCHAR(100),
	Profesor_Especialidad VARCHAR(100),
	Profesor_Telefono VARCHAR(30) 
)
GO

CREATE TABLE Curso ( 
	Curso_ID INT PRIMARY KEY IDENTITY,
	Curso_Nombre VARCHAR(50),
	Curso_Descripcion VARCHAR(50),
	Curso_Creditos INTEGER,
	Curso_Horas_Semana INTEGER,
	Curso_Fechas_Semana DATETIME
)
GO

CREATE TABLE Laboratorio ( 
	Laboratorio_ID INT PRIMARY KEY IDENTITY,
	Laboratorio_Nombre VARCHAR(50),
	Laboratorio_Ubicacion INT,
	Laboratorio_Capacidad INT 
)
GO

CREATE TABLE Programacion ( 
	Programacion_ID INT PRIMARY KEY IDENTITY,
	Programacion_Fecha_Inicio DATETIME,
	Programacion_Fecha_Fin DATETIME,
	Programacion_Hora_Inicio DATETIME,
	Programacion_Hora_Fin DATETIME,
	Laboratorio_ID INT,
	Curso_ID INT,
	Profesor_Codigo INT,

	FOREIGN KEY (Curso_ID) REFERENCES Curso(Curso_ID),
    FOREIGN KEY (Profesor_Codigo) REFERENCES Profesor(Profesor_Codigo),
    FOREIGN KEY (Laboratorio_ID) REFERENCES Laboratorio(Laboratorio_ID)
)
GO

CREATE TABLE Notificacion ( 
	Notificacion_ID INT PRIMARY KEY IDENTITY,
	Notificacion_Destinatario VARCHAR(100),
	Notificacion_Asunto VARCHAR(255),
	Notificacion_Mensaje VARCHAR(500),
	Notificacion_Fecha_Envio DATETIME NOT NULL DEFAULT GETDATE(),
	Programacion_ID INT,

	FOREIGN KEY (Programacion_ID) REFERENCES Programacion(Programacion_ID)
)
GO

CREATE TABLE Detalle ( 
	Detalle_ID INT PRIMARY KEY IDENTITY,
	Estudiante_Codigo INT,
	Programacion_ID INT,
	Detalle_Fecha_Inscripcion DATETIME,
	Detalle_Calificacion DECIMAL(10,2),
	Detalle_Asistencia_Estado VARCHAR(50),
	Detalle_Asistencia_Porcentaje FLOAT,

	FOREIGN KEY (Programacion_ID) REFERENCES Programacion(Programacion_ID),
    FOREIGN KEY (Estudiante_Codigo) REFERENCES Estudiante(Estudiante_Codigo)
)
GO



-- Insertar datos en la tabla Estudiante
INSERT INTO Estudiante (Estudiante_Nombres, Estudiante_Apellidos, Estudiante_Email, Estudiante_QR, Estudiante_Imagen_Rostro, Estudiante_Carrera_Profesional, Estudiante_Estado) VALUES
('DIKE ALFREDO', 'ALBURQUEQUE PASTOR', 'dike.alfredo@gmail.com', 'QR001', 'rostro001.jpg', 'Ingeniería de Sistemas', 'Activo'),
('JUAN CHRISTIAN', 'ALFARO HUAMAN', 'juan.christian@gmail.com', 'QR002', 'rostro002.jpg', 'Ingeniería de Software', 'Activo'),
('JESUS ALONSO', 'ALFARO LOPEZ', 'jesus.alonso@gmail.com', 'QR003', 'rostro003.jpg', 'Ingeniería de Computación', 'Activo'),
('SHINNA CELESTE', 'AMAO COCA', 'shinna.celeste@gmail.com', 'QR004', 'rostro004.jpg', 'Ingeniería de Sistemas', 'Activo'),
('FABIAN GONZALO', 'AQUINO ZEGARRA', 'fabian.gonzalo@gmail.com', 'QR005', 'rostro005.jpg', 'Ingeniería de Software', 'Activo');

-- Insertar datos en la tabla Profesor
INSERT INTO Profesor (Profesor_Nombres, Profesor_Apellidos, Profesor_Email, Profesor_Especialidad, Profesor_Telefono) VALUES
('Carlos', 'Perez', 'carlos.perez@gmail.com', 'Matemáticas', '987654321'),
('Maria', 'Lopez', 'maria.lopez@gmail.com', 'Física', '987654322'),
('Luis', 'Gonzalez', 'luis.gonzalez@gmail.com', 'Química', '987654323'),
('Ana', 'Martinez', 'ana.martinez@gmail.com', 'Biología', '987654324'),
('Jose', 'Rodriguez', 'jose.rodriguez@gmail.com', 'Historia', '987654325');

-- Insertar datos en la tabla Curso
INSERT INTO Curso (Curso_Nombre, Curso_Descripcion, Curso_Creditos, Curso_Horas_Semana, Curso_Fechas_Semana) VALUES
('Matemáticas I', 'Curso de matemáticas básicas', 4, 6, '2024-08-15'),
('Física I', 'Curso de física básica', 4, 6, '2024-08-16'),
('Química I', 'Curso de química básica', 4, 6, '2024-08-17'),
('Biología I', 'Curso de biología básica', 4, 6, '2024-08-18'),
('Historia I', 'Curso de historia básica', 4, 6, '2024-08-19');

-- Insertar datos en la tabla Laboratorio
INSERT INTO Laboratorio (Laboratorio_Nombre, Laboratorio_Ubicacion, Laboratorio_Capacidad) VALUES
('Lab Matemáticas', 101, 30),
('Lab Física', 102, 30),
('Lab Química', 103, 30),
('Lab Biología', 104, 30),
('Lab Historia', 105, 30);

-- Insertar datos en la tabla Programacion
INSERT INTO Programacion (Programacion_Fecha_Inicio, Programacion_Fecha_Fin, Programacion_Hora_Inicio, Programacion_Hora_Fin, Laboratorio_ID, Curso_ID, Profesor_Codigo) VALUES
('2024-09-01', '2024-12-15', '08:00', '10:00', 1, 1, 1),
('2024-09-01', '2024-12-15', '10:00', '12:00', 2, 2, 2),
('2024-09-01', '2024-12-15', '12:00', '14:00', 3, 3, 3),
('2024-09-01', '2024-12-15', '14:00', '16:00', 4, 4, 4),
('2024-09-01', '2024-12-15', '16:00', '18:00', 5, 5, 5);

-- Insertar datos en la tabla Notificacion
INSERT INTO Notificacion (Notificacion_Destinatario, Notificacion_Asunto, Notificacion_Mensaje, Programacion_ID) VALUES
('dike.alfredo@gmail.com', 'Inicio de clases', 'Estimado estudiante, las clases de Matemáticas I iniciarán el 1 de septiembre.', 1),
('juan.christian@gmail.com', 'Inicio de clases', 'Estimado estudiante, las clases de Física I iniciarán el 1 de septiembre.', 2),
('jesus.alonso@gmail.com', 'Inicio de clases', 'Estimado estudiante, las clases de Química I iniciarán el 1 de septiembre.', 3),
('shinna.celeste@gmail.com', 'Inicio de clases', 'Estimado estudiante, las clases de Biología I iniciarán el 1 de septiembre.', 4),
('fabian.gonzalo@gmail.com', 'Inicio de clases', 'Estimado estudiante, las clases de Historia I iniciarán el 1 de septiembre.', 5);

-- Insertar datos en la tabla Detalle
INSERT INTO Detalle (Estudiante_Codigo, Programacion_ID, Detalle_Fecha_Inscripcion, Detalle_Calificacion, Detalle_Asistencia_Estado, Detalle_Asistencia_Porcentaje) VALUES
(1, 1, '2024-08-01', 0, 'Inscrito', 0),
(2, 2, '2024-08-01', 0, 'Inscrito', 0),
(3, 3, '2024-08-01', 0, 'Inscrito', 0),
(4, 4, '2024-08-01', 0, 'Inscrito', 0),
(5, 5, '2024-08-01', 0, 'Inscrito', 0);

SELECT * FROM Estudiante;
SELECT * FROM Profesor;
SELECT * FROM Curso;
SELECT * FROM Laboratorio;
SELECT * FROM Programacion;
SELECT * FROM Notificacion;
SELECT * FROM Detalle;


/*triguers*/
CREATE PROCEDURE sp_BusquedaEstudiantes
    @Codigo INT = NULL,
    @Carrera VARCHAR(100) = NULL,
    @Curso VARCHAR(50) = NULL,
    @FechaIngreso DATETIME = NULL,
    @FechaSalida DATETIME = NULL
AS
BEGIN
    SELECT 
        E.Estudiante_Codigo AS 'Código',
        E.Estudiante_Nombres AS 'Nombres',
        E.Estudiante_Apellidos AS 'Apellidos',
        E.Estudiante_Email AS 'Correo',
        C.Curso_Nombre AS 'Curso',
        E.Estudiante_Carrera_Profesional AS 'Carrera',
        D.Detalle_Asistencia_Porcentaje AS 'Asistencias',
        D.Detalle_Asistencia_Estado AS 'Faltas',
        P.Programacion_Fecha_Inicio AS 'Fecha Ingreso',
        P.Programacion_Fecha_Fin AS 'Fecha Salida'
    FROM 
        Estudiante E
    INNER JOIN 
        Detalle D ON E.Estudiante_Codigo = D.Estudiante_Codigo
    INNER JOIN 
        Programacion P ON D.Programacion_ID = P.Programacion_ID
    INNER JOIN 
        Curso C ON P.Curso_ID = C.Curso_ID
    WHERE
        (@Codigo IS NULL OR E.Estudiante_Codigo = @Codigo) AND
        (@Carrera IS NULL OR E.Estudiante_Carrera_Profesional = @Carrera) AND
        (@Curso IS NULL OR C.Curso_Nombre = @Curso) AND
        (@FechaIngreso IS NULL OR P.Programacion_Fecha_Inicio >= @FechaIngreso) AND
        (@FechaSalida IS NULL OR P.Programacion_Fecha_Fin <= @FechaSalida);
END;
GO

EXEC sp_BusquedaEstudiantes @Codigo = 1, @Carrera = 'Ingeniería de Sistemas', @Curso = 'Matemáticas I', @FechaIngreso = '2024-09-01', @FechaSalida = '2024-12-15';

CREATE PROCEDURE sp_BusquedaEstudiantes
    @Codigo INT = NULL,
    @Ciclo INT = NULL,
    @Carrera VARCHAR(100) = NULL,
    @Curso VARCHAR(50) = NULL,
    @FechaIngreso DATE = NULL,
    @FechaSalida DATE = NULL
AS
BEGIN
    SELECT 
        E.Estudiante_Codigo AS 'Código',
        E.Estudiante_Nombres AS 'Nombres',
        E.Estudiante_Apellidos AS 'Apellidos',
        E.Estudiante_Email AS 'Correo',
        C.Curso_Nombre AS 'Curso',
        E.Estudiante_Carrera_Profesional AS 'Carrera',
        D.Detalle_Asistencia_Porcentaje AS 'Asistencias',
        D.Detalle_Asistencia_Estado AS 'Faltas',
        P.Ciclo AS 'Ciclo'
    FROM 
        Estudiante E
    INNER JOIN 
        Detalle D ON E.Estudiante_Codigo = D.Estudiante_Codigo
    INNER JOIN 
        Programacion P ON D.Programacion_ID = P.Programacion_ID
    INNER JOIN 
        Curso C ON P.Curso_ID = C.Curso_ID
    WHERE
        (@Codigo IS NULL OR E.Estudiante_Codigo = @Codigo) AND
        (@Ciclo IS NULL OR P.Ciclo = @Ciclo) AND
        (@Carrera IS NULL OR E.Estudiante_Carrera_Profesional = @Carrera) AND
        (@Curso IS NULL OR C.Curso_Nombre = @Curso) AND
        (@FechaIngreso IS NULL OR P.Programacion_Fecha_Inicio >= @FechaIngreso) AND
        (@FechaSalida IS NULL OR P.Programacion_Fecha_Fin <= @FechaSalida);
END;
GO
