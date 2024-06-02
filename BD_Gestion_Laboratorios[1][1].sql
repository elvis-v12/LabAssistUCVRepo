CREATE DATABASE BD_Gestion_Laboratorios;
GO

USE BD_Gestion_Laboratorios;
GO
--Almacena datos de cadena de tamaño variable
-----TABLAS:
CREATE TABLE Alumno (
    Alumno_Codigo INT PRIMARY KEY IDENTITY,
    Alumno_Nombres VARCHAR(100),
    Alumno_Apellidos VARCHAR(100),
    Alumno_Email VARCHAR(100),
    Alumno_QR VARCHAR(300),
    Alumno_Imagen_Rostro VARCHAR(500),
    Alumno_Carrera_Profesional VARCHAR(100),
    Alumno_Estado VARCHAR(50)
);
GO

CREATE TABLE Profesor (
    Profesor_Codigo INT PRIMARY KEY IDENTITY,
    Profesor_Nombres VARCHAR(100),
    Profesor_Apellidos VARCHAR(100),
    Profesor_Email VARCHAR(100),
    Profesor_Especialidad VARCHAR(100),
    Profesor_Telefono VARCHAR(30)
);
GO

CREATE TABLE Laboratorio (
    Laboratorio_ID INT PRIMARY KEY IDENTITY,
    Laboratorio_Nombre VARCHAR(100),
    Laboratorio_Ubicacion INT,
    Laboratorio_Capacidad INT
);
GO


CREATE TABLE Curso (
    Curso_ID INT PRIMARY KEY IDENTITY,
    Curso_Nombre VARCHAR(100),
    Curso_Total_Alumnos INT,
    Curso_Profesor_Codigo INT,
    FOREIGN KEY (Curso_Profesor_Codigo) REFERENCES Profesor(Profesor_Codigo)
);
GO

CREATE TABLE Horario (
    Horario_ID INT PRIMARY KEY IDENTITY,
    Horario_Curso_ID INT,
    Horario_Laboratorio_ID INT,
    Horario_Dia_Semana VARCHAR(10),
    Horario_Hora_Inicio DATETIME,
    Horario_Hora_Fin DATETIME,
    FOREIGN KEY (Horario_Curso_ID) REFERENCES Curso(Curso_ID),
    FOREIGN KEY (Horario_Laboratorio_ID) REFERENCES Laboratorio(Laboratorio_ID)
);
GO

CREATE TABLE Asistencia (
    Asistencia_ID INT PRIMARY KEY IDENTITY,
    Asistencia_Alumno_ID INT,
    Asistencia_Horario_ID INT,
    Asistencia_Fecha_Hora DATETIME,
    Asistencia_Porcentaje FLOAT,
    Asistencia_Estado VARCHAR(50), 
    FOREIGN KEY (Asistencia_Alumno_ID) REFERENCES Alumno(Alumno_Codigo),
    FOREIGN KEY (Asistencia_Horario_ID) REFERENCES Horario(Horario_ID)
);
GO
 
 --Observaciones 
CREATE TABLE Observaciones_Laboratorio (
    Observacion_ID INT PRIMARY KEY IDENTITY,
    Horario_ID INT NULL, -- thissss, principal
    Fecha_Observacion DATETIME NOT NULL DEFAULT GETDATE(),
    Observacion VARCHAR(500),
    FOREIGN KEY (Horario_ID) REFERENCES Horario(Horario_ID),  
);
GO

-- Notificación a Correo (En base al porcentaje de inasistencias, noti al alumno perjudicado)
CREATE TABLE Notificacion_Correo (
    Notificacion_ID INT PRIMARY KEY IDENTITY,
    Destinatario VARCHAR(100),
    Asunto VARCHAR(255),
    Mensaje VARCHAR(500),
    Fecha_Envio DATETIME NOT NULL DEFAULT GETDATE(),
    Asistencia_ID INT NULL,
    FOREIGN KEY (Asistencia_ID) REFERENCES Asistencia(Asistencia_ID)
);
GO

-- Insertar datos de prueba para la tabla Alumno
INSERT INTO Alumno (Alumno_Nombres, Alumno_Apellidos, Alumno_Email, Alumno_QR, Alumno_Imagen_Rostro, Alumno_Carrera_Profesional, Alumno_Estado)
VALUES
('Juan', 'Pérez', 'juan.perez@ucv.edu.pe', 'QR1', 'imagen1.jpg', 'Ingeniería de Sistemas', 'Activo'),
('María', 'García', 'maria.garcia@ucv.edu.pe', 'QR2', 'imagen2.jpg', 'Medicina', 'Activo');

-- Insertar datos de prueba para la tabla Profesor
INSERT INTO Profesor (Profesor_Nombres, Profesor_Apellidos, Profesor_Email, Profesor_Especialidad, Profesor_Telefono)
VALUES
('Carlos', 'Sánchez', 'carlos.sanchez@ucv.edu.pe', 'Matemáticas', '123456789'),
('Ana', 'López', 'ana.lopez@ucv.edu.pe', 'Física', '987654321');

-- Insertar datos de prueba para la tabla Laboratorio
INSERT INTO Laboratorio (Laboratorio_Nombre, Laboratorio_Ubicacion, Laboratorio_Capacidad)
VALUES
('Lab. Computación', 101, 30),
('Lab. Física', 102, 25);

-- Insertar datos de prueba para la tabla Curso
INSERT INTO Curso (Curso_Nombre, Curso_Total_Alumnos, Curso_Profesor_Codigo)
VALUES
('Cálculo', 30, 1),
('Física General', 25, 2);

-- Insertar datos de prueba para la tabla Horario
INSERT INTO Horario (Horario_Curso_ID, Horario_Laboratorio_ID, Horario_Dia_Semana, Horario_Hora_Inicio, Horario_Hora_Fin)
VALUES
(1, 1, 'Lunes', '2024-06-03 08:00:00', '2024-06-03 10:00:00'),
(2, 2, 'Martes', '2024-06-04 10:00:00', '2024-06-04 12:00:00');

-- Insertar datos de prueba para la tabla Asistencia
INSERT INTO Asistencia (Asistencia_Alumno_ID, Asistencia_Horario_ID, Asistencia_Fecha_Hora, Asistencia_Porcentaje, Asistencia_Estado)
VALUES
(1, 1, '2024-06-03 08:05:00', 100.0, 'Presente'),
(2, 2, '2024-06-04 10:15:00', 50.0, 'Tarde');

-- Insertar datos de prueba para la tabla Observaciones_Laboratorio
INSERT INTO Observaciones_Laboratorio (Horario_ID, Observacion)
VALUES
(1, 'El proyector no funciona correctamente.'),
(2, 'Faltan sillas en el laboratorio.');

-- Insertar datos de prueba para la tabla Notificacion_Correo
INSERT INTO Notificacion_Correo (Destinatario, Asunto, Mensaje, Asistencia_ID)
VALUES
('juan.perez@ucv.edu', 'Inasistencia Registrada', 'Se ha registrado una inasistencia en su curso.', 2);

CREATE PROCEDURE InsertarAsistencia
    @Alumno_ID INT,
    @Horario_ID INT,
    @Fecha_Hora DATETIME,
    @Porcentaje FLOAT,
    @Estado VARCHAR(50)
AS
BEGIN
    INSERT INTO Asistencia (Asistencia_Alumno_ID, Asistencia_Horario_ID, Asistencia_Fecha_Hora, Asistencia_Porcentaje, Asistencia_Estado)
    VALUES (@Alumno_ID, @Horario_ID, @Fecha_Hora, @Porcentaje, @Estado);

    -- Verificar si el porcentaje de asistencia es menor al 50% para enviar notificación
    IF @Porcentaje < 50
    BEGIN
        DECLARE @Email VARCHAR(100);
        SELECT @Email = Alumno_Email FROM Alumno WHERE Alumno_Codigo = @Alumno_ID;

        INSERT INTO Notificacion_Correo (Destinatario, Asunto, Mensaje, Asistencia_ID)
        VALUES (@Email, 'Inasistencia Registrada', 'Se ha registrado una inasistencia en su curso.', SCOPE_IDENTITY());
    END
END
GO

CREATE PROCEDURE InsertarObservacion
    @Horario_ID INT,
    @Observacion VARCHAR(500)
AS
BEGIN
    INSERT INTO Observaciones_Laboratorio (Horario_ID, Observacion)
    VALUES (@Horario_ID, @Observacion);
END
GO

CREATE PROCEDURE EnviarNotificacionCorreo
    @Destinatario VARCHAR(100),
    @Asunto VARCHAR(255),
    @Mensaje VARCHAR(500),
    @Asistencia_ID INT
AS
BEGIN
    INSERT INTO Notificacion_Correo (Destinatario, Asunto, Mensaje, Asistencia_ID)
    VALUES (@Destinatario, @Asunto, @Mensaje, @Asistencia_ID);
END
GO

EXEC InsertarAsistencia @Alumno_ID = 1, @Horario_ID = 1, @Fecha_Hora = '2024-06-03 08:10:00', @Porcentaje = 40.0, @Estado = 'Tarde';
EXEC InsertarAsistencia @Alumno_ID = 2, @Horario_ID = 2, @Fecha_Hora = '2024-06-04 10:20:00', @Porcentaje = 100.0, @Estado = 'Presente';

EXEC InsertarObservacion @Horario_ID = 1, @Observacion = 'Problema con el equipo de audio.';
EXEC InsertarObservacion @Horario_ID = 2, @Observacion = 'Necesidad de mayor ventilación en el laboratorio.';

EXEC EnviarNotificacionCorreo @Destinatario = 'maria.garcia@ucv.edu.pe', @Asunto = 'Aviso Importante', @Mensaje = 'Por favor, revise su asistencia.', @Asistencia_ID = 1;
EXEC EnviarNotificacionCorreo @Destinatario = 'juan.perez@ucv.edu.pe', @Asunto = 'Actualización de Incidencias', @Mensaje = 'Se ha registrado una nueva observación en el laboratorio.', @Asistencia_ID = 2;

------ VER
SELECT * FROM Alumno;
SELECT * FROM Profesor;
SELECT * FROM Laboratorio;
SELECT * FROM Curso;
SELECT * FROM Horario;
SELECT * FROM Asistencia;
SELECT * FROM Observaciones_Laboratorio;
SELECT * FROM Notificacion_Correo;