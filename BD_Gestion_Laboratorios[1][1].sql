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
ALTER TABLE Alumno
ADD Alumno_Cdg VARCHAR(20);
ALTER TABLE Alumno
ADD Ciclo VARCHAR(20);

 select * from Alumno
delete from Alumno
DBCC CHECKIDENT ('Alumno', RESEED, 0);

INSERT INTO Alumno (Alumno_Nombres, Alumno_Apellidos, Alumno_Email, Alumno_Carrera_Profesional, Alumno_Estado)
VALUES
('DIKE ALFREDO', 'ALBURQUEQUE PASTOR', 'dike.alfredo@example.com', 'Ingeniería', 'Activo'),
('JUAN CHRISTIAN', 'ALFARO HUAMAN', 'juan.christian@example.com', 'Derecho', 'Activo'),
('JESUS ALONSO', 'ALFARO LOPEZ', 'jesus.alonso@example.com', 'Medicina', 'Activo'),
('SHINNA CELESTE', 'AMAO COCA', 'shinna.celeste@example.com', 'Arquitectura', 'Activo'),
('FABIAN GONZALO', 'AQUINO ZEGARRA', 'fabian.gonzalo@example.com', 'Economía', 'Activo'),
('EDUARDO ALFREDO', 'ARDILES ELIAS', 'eduardo.alfredo@example.com', 'Psicología', 'Activo'),
('JUAN ANTONIO', 'ARESTE VEGA', 'juan.antonio@example.com', 'Sociología', 'Activo'),
('KATHERIN NICOL', 'AVILA MEDINA', 'katherin.nicol@example.com', 'Filosofía', 'Activo'),
('JAIME BERNARDO', 'BARDALES ACUÑA', 'jaime.bernardo@example.com', 'Biología', 'Activo'),
('FABRIZIO JESUS', 'BEJAR SARMIENTO', 'fabrizio.jesus@example.com', 'Química', 'Activo'),
('ALEXIS JAVIER', 'BLAS MENDOZA', 'alexis.javier@example.com', 'Física', 'Activo'),
('NILTON ORLANDO', 'BONIFACIO GARCIA', 'nilton.orlando@example.com', 'Matemáticas', 'Activo'),
('RAFAEL ALEXANDER', 'BONIFAZ ALIAGA', 'rafael.alexander@example.com', 'Historia', 'Activo'),
('SANDRA MERCEDES', 'CABRERA AVILA', 'sandra.mercedes@example.com', 'Geografía', 'Activo'),
('JORGE DENNIS', 'CASTILLO ROMAN', 'jorge.dennis@example.com', 'Antropología', 'Activo'),
('JHONY ALEXIS', 'CERNA MORENO', 'jhony.alexis@example.com', 'Educación', 'Activo'),
('JAYCOB LEONARDO', 'CHACON SILVA', 'jaycob.leonardo@example.com', 'Ciencias Políticas', 'Activo'),
('VANIA JOYZA', 'ECCOÑA FALCON', 'vania.joyza@example.com', 'Comunicación', 'Activo'),
('MAURICIO VALENTINO', 'ESPINOZA AÑASCO', 'mauricio.valentino@example.com', 'Periodismo', 'Activo'),
('JEISON IMANOL', 'FALLA ESQUIEMBRE', 'jeison.imanol@example.com', 'Arte', 'Activo'),
('JOSEP ALDAIR', 'GARCIA MUÑOZ', 'josep.aldair@example.com', 'Música', 'Activo'),
('RONY DANILO', 'HUANACHIN CONISLLA', 'rony.danilo@example.com', 'Diseño', 'Activo'),
('BRYAN DANIEL', 'JIHUALLANCA SANCHEZ', 'bryan.daniel@example.com', 'Informática', 'Activo'),
('RENZO FABRIZIO', 'MEDINA MIRANDA', 'renzo.fabrizio@example.com', 'Ingeniería Industrial', 'Activo'),
('DARWIN ALEXIS', 'MONTERO LEYTON', 'darwin.alexis@example.com', 'Ingeniería Civil', 'Activo'),
('JUAN CARLOS', 'NAITO PEREZ', 'juan.carlos@example.com', 'Ingeniería Mecánica', 'Activo'),
('ANYELO GIOVANNI', 'NUÑEZ OBISPO', 'anyelo.giovanni@example.com', 'Ingeniería Eléctrica', 'Activo'),
('GREGORY WANKARLO', 'OCHOA VASQUEZ', 'gregory.wankar@example.com', 'Ingeniería Electrónica', 'Activo');
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 1;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 2;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 3;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 4;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 5;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 6;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 7;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 8;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 9;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 10;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 11;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 12;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 13;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 14;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 15;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 16;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 17;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 18;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 19;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 20;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 21;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 22;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 23;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 24;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 25;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 26;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 27;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 28;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 29;
UPDATE Alumno SET Ciclo = '5' WHERE Alumno_Codigo = 30;
SELECT IDENT_CURRENT('Alumno') AS Current_Identity;
UPDATE Alumno SET Alumno_Cdg = '7837551866' WHERE Alumno_Codigo = 1;
UPDATE Alumno SET Alumno_Cdg = '7383388303' WHERE Alumno_Codigo = 2;
UPDATE Alumno SET Alumno_Cdg = '7664131015' WHERE Alumno_Codigo = 3;
UPDATE Alumno SET Alumno_Cdg = '7361908617' WHERE Alumno_Codigo = 4;
UPDATE Alumno SET Alumno_Cdg = '7179780765' WHERE Alumno_Codigo = 5;
UPDATE Alumno SET Alumno_Cdg = '7736084736' WHERE Alumno_Codigo = 6;
UPDATE Alumno SET Alumno_Cdg = '7437565925' WHERE Alumno_Codigo = 7;
UPDATE Alumno SET Alumno_Cdg = '7544344689' WHERE Alumno_Codigo = 8;
UPDATE Alumno SET Alumno_Cdg = '7310142011' WHERE Alumno_Codigo = 9;
UPDATE Alumno SET Alumno_Cdg = '7689676042' WHERE Alumno_Codigo = 10;
UPDATE Alumno SET Alumno_Cdg = '7229178004' WHERE Alumno_Codigo = 11;
UPDATE Alumno SET Alumno_Cdg = '7316436622' WHERE Alumno_Codigo = 12;
UPDATE Alumno SET Alumno_Cdg = '7537506233' WHERE Alumno_Codigo = 13;
UPDATE Alumno SET Alumno_Cdg = '7229178004' WHERE Alumno_Codigo = 14;
UPDATE Alumno SET Alumno_Cdg = '7962351170' WHERE Alumno_Codigo = 15;
UPDATE Alumno SET Alumno_Cdg = '7571766137' WHERE Alumno_Codigo = 16;
UPDATE Alumno SET Alumno_Cdg = '7127789046' WHERE Alumno_Codigo = 17;
UPDATE Alumno SET Alumno_Cdg = '7112794094' WHERE Alumno_Codigo = 18;
UPDATE Alumno SET Alumno_Cdg = '7962351170' WHERE Alumno_Codigo = 19;
UPDATE Alumno SET Alumno_Cdg = '7565519677' WHERE Alumno_Codigo = 20;
UPDATE Alumno SET Alumno_Cdg = '7537506233' WHERE Alumno_Codigo = 21;
UPDATE Alumno SET Alumno_Cdg = '7153219123' WHERE Alumno_Codigo = 22;
UPDATE Alumno SET Alumno_Cdg = '7153219123' WHERE Alumno_Codigo = 23;
UPDATE Alumno SET Alumno_Cdg = '7571766137' WHERE Alumno_Codigo = 24;
UPDATE Alumno SET Alumno_Cdg = '7537506233' WHERE Alumno_Codigo = 25;
UPDATE Alumno SET Alumno_Cdg = '7047495777' WHERE Alumno_Codigo = 26;
UPDATE Alumno SET Alumno_Cdg = '7171682393' WHERE Alumno_Codigo = 27;
UPDATE Alumno SET Alumno_Cdg = '7407355082' WHERE Alumno_Codigo = 28;
UPDATE Alumno SET Alumno_Cdg = '7509745360' WHERE Alumno_Codigo = 29;
UPDATE Alumno SET Alumno_Cdg = '7447428884' WHERE Alumno_Codigo = 30;
CREATE PROCEDURE sp_ObtenerDatosAlumnosFiltrado
    @Curso_Nombre VARCHAR(100) = NULL,
    @Alumno_Cdg VARCHAR(20) = NULL,
    @Ciclo VARCHAR(20) = NULL,
    @Alumno_Carrera_Profesional VARCHAR(100) = NULL
AS
BEGIN
    SELECT 
        A.Alumno_Cdg,
        A.Alumno_Nombres,
        A.Alumno_Apellidos,
        A.Alumno_Email,
        A.Alumno_Carrera_Profesional,
        C.Curso_Nombre,
        ISNULL(AVG(AST.Asistencia_Porcentaje), 0) AS Asistencia_Porcentaje,
        CASE
            WHEN AVG(AST.Asistencia_Porcentaje) >= 75 THEN 'Aprobado'
            ELSE 'Reprobado'
        END AS Asistencia_Estado,
        A.Ciclo
    FROM 
        Alumno A
    LEFT JOIN 
        Asistencia AST ON A.Alumno_Codigo = AST.Asistencia_Alumno_ID
    LEFT JOIN 
        Horario H ON AST.Asistencia_Horario_ID = H.Horario_ID
    LEFT JOIN 
        Curso C ON H.Horario_Curso_ID = C.Curso_ID
    WHERE 
        (@Curso_Nombre IS NULL OR C.Curso_Nombre = @Curso_Nombre) AND
        (@Alumno_Cdg IS NULL OR A.Alumno_Cdg = @Alumno_Cdg) AND
        (@Ciclo IS NULL OR A.Ciclo = @Ciclo) AND
        (@Alumno_Carrera_Profesional IS NULL OR A.Alumno_Carrera_Profesional = @Alumno_Carrera_Profesional)
    GROUP BY 
        A.Alumno_Cdg,
        A.Alumno_Nombres,
        A.Alumno_Apellidos,
        A.Alumno_Email,
        A.Alumno_Carrera_Profesional,
        C.Curso_Nombre,
        A.Ciclo
    ORDER BY 
        A.Alumno_Cdg;
END;
GO
-- Ejemplo de cómo llamar al procedimiento almacenado
EXEC sp_ObtenerDatosAlumnosFiltrado @Curso_Nombre = 'Matemáticas Avanzadas', @Alumno_Cdg = '7837551866', @Ciclo = '5', @Alumno_Carrera_Profesional = 'Ingeniería';

select * from Alumno
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

INSERT INTO Curso (Curso_Nombre, Curso_Total_Alumnos, Curso_Profesor_Codigo)
VALUES ('Matemáticas Avanzadas', 30, 1),
       ('Historia del Arte', 25, 2),
       ('Programación en Java', 20, 3),
       ('Física Cuántica', 25, 1),
       ('Química Orgánica', 20, 2),
       ('Biología Molecular', 30, 3),
       ('Estadística', 25, 1),
       ('Algoritmos y Estructuras de Datos', 20, 3),
       ('Historia Contemporánea', 25, 2),
       ('Redes de Computadoras', 20, 3),
       ('Ingeniería de Software', 30, 3),
       ('Bases de Datos', 25, 3),
       ('Sistemas Operativos', 20, 3),
       ('Inteligencia Artificial', 25, 3),
       ('Desarrollo Web', 30, 3),
       ('Historia de la Ciencia', 25, 2),
       ('Microbiología', 20, 2),
       ('Bioquímica', 30, 2),
       ('Filosofía Antigua', 25, 2),
       ('Arte Moderno', 20, 2),
       ('Literatura Clásica', 30, 2),
       ('Cálculo Integral', 25, 1),
       ('Álgebra Lineal', 20, 1),
       ('Geometría Analítica', 30, 1),
       ('Matemáticas Discretas', 25, 1),
       ('Análisis Numérico', 20, 1),
       ('Teoría de Números', 30, 1);

delete from  Curso
select * from Curso
DBCC CHECKIDENT ('Curso', RESEED, 0);

delete from  Profesor
select * from Profesor
DBCC CHECKIDENT ('Profesor', RESEED, 0);
INSERT INTO Profesor (Profesor_Nombres, Profesor_Apellidos, Profesor_Email, Profesor_Especialidad, Profesor_Telefono)
VALUES ('Juan', 'Perez', 'juan.perez@example.com', 'Matemáticas', '123456789'),
       ('Ana', 'Gomez', 'ana.gomez@example.com', 'Historia', '987654321'),
       ('Carlos', 'Lopez', 'carlos.lopez@example.com', 'Programación', '123123123');
	   select * from Horario
	   SELECT Curso_ID FROM Curso;
	   -- Verificar los IDs de curso
SELECT Curso_ID, Curso_Nombre FROM Curso;
SELECT * FROM Curso;
SELECT DISTINCT Horario_Curso_ID FROM Horario;

-- Asegúrate de que los valores de Horario_Curso_ID y Horario_Laboratorio_ID existen en las tablas Curso y Laboratorio
-- Insertar datos en la tabla Horario
SELECT * FROM Curso;

INSERT INTO Horario (Horario_Curso_ID, Horario_Laboratorio_ID, Horario_Dia_Semana, Horario_Hora_Inicio, Horario_Hora_Fin)
VALUES 
(1, 1, 'Lunes', '2024-07-01 08:00:00', '2024-07-01 10:00:00'),
(2, 2, 'Martes', '2024-07-02 10:00:00', '2024-07-02 12:00:00'),
(3, 3, 'Miércoles', '2024-07-03 14:00:00', '2024-07-03 16:00:00'),
(4, 1, 'Jueves', '2024-07-04 08:00:00', '2024-07-04 10:00:00'),
(5, 2, 'Viernes', '2024-07-05 10:00:00', '2024-07-05 12:00:00'),
(6, 3, 'Sábado', '2024-07-06 14:00:00', '2024-07-06 16:00:00'),
(7, 1, 'Lunes', '2024-07-07 08:00:00', '2024-07-07 10:00:00'),
(8, 2, 'Martes', '2024-07-08 10:00:00', '2024-07-08 12:00:00'),
(9, 3, 'Miércoles', '2024-07-09 14:00:00', '2024-07-09 16:00:00'),
(10, 1, 'Jueves', '2024-07-10 08:00:00', '2024-07-10 10:00:00'),
(11, 2, 'Viernes', '2024-07-11 10:00:00', '2024-07-11 12:00:00'),
(12, 3, 'Sábado', '2024-07-12 14:00:00', '2024-07-12 16:00:00'),
(13, 1, 'Lunes', '2024-07-13 08:00:00', '2024-07-13 10:00:00'),
(14, 2, 'Martes', '2024-07-14 10:00:00', '2024-07-14 12:00:00'),
(15, 3, 'Miércoles', '2024-07-15 14:00:00', '2024-07-15 16:00:00'),
(16, 1, 'Jueves', '2024-07-16 08:00:00', '2024-07-16 10:00:00'),
(17, 2, 'Viernes', '2024-07-17 10:00:00', '2024-07-17 12:00:00'),
(18, 3, 'Sábado', '2024-07-18 14:00:00', '2024-07-18 16:00:00'),
(19, 1, 'Lunes', '2024-07-19 08:00:00', '2024-07-19 10:00:00'),
(20, 2, 'Martes', '2024-07-20 10:00:00', '2024-07-20 12:00:00'),
(21, 3, 'Miércoles', '2024-07-21 14:00:00', '2024-07-21 16:00:00'),
(22, 1, 'Jueves', '2024-07-22 08:00:00', '2024-07-22 10:00:00'),
(23, 2, 'Viernes', '2024-07-23 10:00:00', '2024-07-23 12:00:00'),
(24, 3, 'Sábado', '2024-07-24 14:00:00', '2024-07-24 16:00:00'),
(25, 1, 'Lunes', '2024-07-25 08:00:00', '2024-07-25 10:00:00'),
(26, 2, 'Martes', '2024-07-26 10:00:00', '2024-07-26 12:00:00'),
(27, 3, 'Miércoles', '2024-07-27 14:00:00', '2024-07-27 16:00:00')
GO
delete from  Horario
select * from Horario
DBCC CHECKIDENT ('Horario', RESEED, 0);

-- Verificar que los datos se han insertado correctamente
SELECT * FROM Horario;

	   -- Poblar la tabla Laboratorio
INSERT INTO Laboratorio (Laboratorio_Nombre, Laboratorio_Ubicacion, Laboratorio_Capacidad)
VALUES 
('Lab Redes', 1, 30),
('Lab Programacion orientada a objetos', 2, 25),
('Lab Gestiion de datos ', 3, 20);
select * from Laboratorio
CREATE PROCEDURE sp_ObtenerDatosAlumnos
AS
BEGIN
    SELECT 
        A.Alumno_Cdg,
        A.Alumno_Nombres,
        A.Alumno_Apellidos,
        A.Alumno_Email,
        A.Alumno_Carrera_Profesional,
        C.Curso_Nombre,
        ISNULL(AVG(AST.Asistencia_Porcentaje), 0) AS Asistencia_Porcentaje,
        CASE
            WHEN AVG(AST.Asistencia_Porcentaje) >= 75 THEN 'Aprobado'
            ELSE 'Reprobado'
        END AS Asistencia_Estado,
        A.Ciclo
    FROM 
        Alumno A
    LEFT JOIN 
        Asistencia AST ON A.Alumno_Codigo = AST.Asistencia_Alumno_ID
    LEFT JOIN 
        Horario H ON AST.Asistencia_Horario_ID = H.Horario_ID
    LEFT JOIN 
        Curso C ON H.Horario_Curso_ID = C.Curso_ID
    GROUP BY 
        A.Alumno_Cdg,
        A.Alumno_Nombres,
        A.Alumno_Apellidos,
        A.Alumno_Email,
        A.Alumno_Carrera_Profesional,
        C.Curso_Nombre,
        A.Ciclo
    ORDER BY 
        A.Alumno_Cdg;
END;
GO
INSERT INTO Profesor (Profesor_Nombres, Profesor_Apellidos, Profesor_Email, Profesor_Especialidad, Profesor_Telefono)
VALUES ('Juan', 'Perez', 'juan.perez@example.com', 'Matemáticas', '123456789'),
       ('Ana', 'Gomez', 'ana.gomez@example.com', 'Historia', '987654321'),
       ('Carlos', 'Lopez', 'carlos.lopez@example.com', 'Programación', '123123123');
	   select * from Curso
	   delete from  Curso
select * from Curso
DBCC CHECKIDENT ('Curso', RESEED, 0);
INSERT INTO Curso (Curso_Nombre, Curso_Total_Alumnos, Curso_Profesor_Codigo)
VALUES ('Matemáticas Avanzadas', 30, 1),
       ('Historia del Arte', 25, 2),
       ('Programación en Java', 20, 3),
       ('Física Cuántica', 25, 1),
       ('Química Orgánica', 20, 2),
       ('Biología Molecular', 30, 3),
       ('Estadística', 25, 1),
       ('Algoritmos y Estructuras de Datos', 20, 3),
       ('Historia Contemporánea', 25, 2),
       ('Redes de Computadoras', 20, 3),
       ('Ingeniería de Software', 30, 3),
       ('Bases de Datos', 25, 3),
       ('Sistemas Operativos', 20, 3),
       ('Inteligencia Artificial', 25, 3),
       ('Desarrollo Web', 30, 3),
       ('Historia de la Ciencia', 25, 2),
       ('Microbiología', 20, 2),
       ('Bioquímica', 30, 2),
       ('Filosofía Antigua', 25, 2),
       ('Arte Moderno', 20, 2),
       ('Literatura Clásica', 30, 2),
       ('Cálculo Integral', 25, 1),
       ('Álgebra Lineal', 20, 1),
       ('Geometría Analítica', 30, 1),
       ('Matemáticas Discretas', 25, 1),
       ('Análisis Numérico', 20, 1),
       ('Teoría de Números', 30, 1);
GO

-- Inserta datos en la tabla Horario
INSERT INTO Horario (Horario_Curso_ID, Horario_Laboratorio_ID, Horario_Dia_Semana, Horario_Hora_Inicio, Horario_Hora_Fin)
VALUES (1, 1, 'Lunes', '2024-07-01 08:00:00', '2024-07-01 10:00:00'),
       (2, 2, 'Martes', '2024-07-02 10:00:00', '2024-07-02 12:00:00'),
       (3, 3, 'Miércoles', '2024-07-03 14:00:00', '2024-07-03 16:00:00'),
       (4, 1, 'Jueves', '2024-07-04 08:00:00', '2024-07-04 10:00:00'),
       (5, 2, 'Viernes', '2024-07-05 10:00:00', '2024-07-05 12:00:00'),
       (6, 3, 'Sábado', '2024-07-06 14:00:00', '2024-07-06 16:00:00'),
       (7, 1, 'Lunes', '2024-07-07 08:00:00', '2024-07-07 10:00:00'),
       (8, 2, 'Martes', '2024-07-08 10:00:00', '2024-07-08 12:00:00'),
       (9, 3, 'Miércoles', '2024-07-09 14:00:00', '2024-07-09 16:00:00'),
       (10, 1, 'Jueves', '2024-07-10 08:00:00', '2024-07-10 10:00:00'),
       (11, 2, 'Viernes', '2024-07-11 10:00:00', '2024-07-11 12:00:00'),
       (12, 3, 'Sábado', '2024-07-12 14:00:00', '2024-07-12 16:00:00'),
       (13, 1, 'Lunes', '2024-07-13 08:00:00', '2024-07-13 10:00:00'),
       (14, 2, 'Martes', '2024-07-14 10:00:00', '2024-07-14 12:00:00'),
       (15, 3, 'Miércoles', '2024-07-15 14:00:00', '2024-07-15 16:00:00'),
       (16, 1, 'Jueves', '2024-07-16 08:00:00', '2024-07-16 10:00:00'),
       (17, 2, 'Viernes', '2024-07-17 10:00:00', '2024-07-17 12:00:00'),
       (18, 3, 'Sábado', '2024-07-18 14:00:00', '2024-07-18 16:00:00'),
       (19, 1, 'Lunes', '2024-07-19 08:00:00', '2024-07-19 10:00:00'),
       (20, 2, 'Martes', '2024-07-20 10:00:00', '2024-07-20 12:00:00'),
       (21, 3, 'Miércoles', '2024-07-21 14:00:00', '2024-07-21 16:00:00'),
       (22, 1, 'Jueves', '2024-07-22 08:00:00', '2024-07-22 10:00:00'),
       (23, 2, 'Viernes', '2024-07-23 10:00:00', '2024-07-23 12:00:00'),
       (24, 3, 'Sábado', '2024-07-24 14:00:00', '2024-07-24 16:00:00'),
       (25, 1, 'Lunes', '2024-07-25 08:00:00', '2024-07-25 10:00:00'),
       (26, 2, 'Martes', '2024-07-26 10:00:00', '2024-07-26 12:00:00'),
       (27, 3, 'Miércoles', '2024-07-27 14:00:00', '2024-07-27 16:00:00'),
       (28, 1, 'Jueves', '2024-07-28 08:00:00', '2024-07-28 10:00:00');
	   INSERT INTO Asistencia (Asistencia_Alumno_ID, Asistencia_Horario_ID, Asistencia_Fecha_Hora, Asistencia_Porcentaje, Asistencia_Estado)
VALUES (1, 1, '2024-07-01 08:00:00', 90, 'Presente'),
       (2, 2, '2024-07-02 10:00:00', 85, 'Presente'),
       (3, 3, '2024-07-03 14:00:00', 80, 'Presente'),
       (4, 4, '2024-07-04 08:00:00', 75, 'Presente'),
       (5, 5, '2024-07-05 10:00:00', 70, 'Presente'),
       (6, 6, '2024-07-06 14:00:00', 65, 'Presente'),
       (7, 7, '2024-07-07 08:00:00', 60, 'Presente'),
       (8, 8, '2024-07-08 10:00:00', 55, 'Presente'),
       (9, 9, '2024-07-09 14:00:00', 50, 'Presente'),
       (10, 10, '2024-07-10 08:00:00', 45, 'Presente'),
       (11, 11, '2024-07-11 10:00:00', 40, 'Presente'),
       (12, 12, '2024-07-12 14:00:00', 35, 'Presente'),
       (13, 13, '2024-07-13 08:00:00', 30, 'Presente'),
       (14, 14, '2024-07-14 10:00:00', 25, 'Presente'),
       (15, 15, '2024-07-15 14:00:00', 20, 'Presente'),
       (16, 16, '2024-07-16 08:00:00', 15, 'Presente'),
       (17, 17, '2024-07-17 10:00:00', 10, 'Presente'),
       (18, 18, '2024-07-18 14:00:00', 5, 'Presente'),
       (19, 19, '2024-07-19 08:00:00', 90, 'Presente'),
       (20, 20, '2024-07-20 10:00:00', 85, 'Presente'),
       (21, 21, '2024-07-21 14:00:00', 80, 'Presente'),
       (22, 22, '2024-07-22 08:00:00', 75, 'Presente'),
       (23, 23, '2024-07-23 10:00:00', 70, 'Presente'),
       (24, 24, '2024-07-24 14:00:00', 65, 'Presente'),
       (25, 25, '2024-07-25 08:00:00', 60, 'Presente'),
       (26, 26, '2024-07-26 10:00:00', 55, 'Presente'),
       (27, 27, '2024-07-27 14:00:00', 50, 'Presente')
	   go
	   select * from Asistencia
EXEC sp_ObtenerDatosAlumnos;
select * from Alumno
select * from Asistencia
select * from Curso
select * from Horario
select * from Laboratorio
select * from Notificacion_Correo
select * from Observaciones_Laboratorio
select * from Profesor
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

/*PRUEBA-------------------*/

DROP PROCEDURE sp_ObtenerDatosLaboratorio
DROP PROCEDURE IF EXISTS sp_ObtenerDatosLaboratorio;
GO
DROP PROCEDURE IF EXISTS sp_ObtenerDatosLaboratorio;
GO

CREATE PROCEDURE sp_ObtenerDatosLaboratorio 
    @Horario_Hora_Inicio DATETIME,
    @Horario_Hora_Fin DATETIME,
    @Laboratorio_Ubicacion INT,
    @Laboratorio_Nombre VARCHAR(100)
AS
BEGIN
    SELECT 
        L.Laboratorio_ID,
        L.Laboratorio_Nombre,
        L.Laboratorio_Capacidad,
        C.Curso_Nombre,
        ISNULL(AVG(AST.Asistencia_Porcentaje), 0) AS Asistencia_Porcentaje,
        CASE
            WHEN AVG(AST.Asistencia_Porcentaje) >= 75 THEN 'Aprobado'
            ELSE 'Reprobado'
        END AS Asistencia_Estado,
        A.Alumno_Nombres,
        A.Alumno_Apellidos
    FROM 
        Laboratorio L
    INNER JOIN 
        Horario H ON L.Laboratorio_ID = H.Horario_Laboratorio_ID
    INNER JOIN 
        Curso C ON H.Horario_Curso_ID = C.Curso_ID
    LEFT JOIN 
        Asistencia AST ON H.Horario_ID = AST.Asistencia_Horario_ID
    LEFT JOIN 
        Alumno A ON AST.Asistencia_Alumno_ID = A.Alumno_Codigo
    WHERE 
        H.Horario_Hora_Inicio >= @Horario_Hora_Inicio AND
        H.Horario_Hora_Fin <= @Horario_Hora_Fin AND
        L.Laboratorio_Ubicacion = @Laboratorio_Ubicacion AND
        L.Laboratorio_Nombre = @Laboratorio_Nombre
    GROUP BY 
        L.Laboratorio_ID,
        L.Laboratorio_Nombre,
        L.Laboratorio_Capacidad,
        C.Curso_Nombre,
        A.Alumno_Nombres,
        A.Alumno_Apellidos
    ORDER BY 
        L.Laboratorio_Nombre, C.Curso_Nombre, A.Alumno_Nombres;
END;
GO

EXEC sp_ObtenerDatosLaboratorio 
    @Horario_Hora_Inicio = '2024-07-01 08:00:00.000', 
    @Horario_Hora_Fin = '2024-07-01 10:00:00.000', 
    @Laboratorio_Ubicacion = 1, 
    @Laboratorio_Nombre = 'Lab Redes';

	EXEC sp_ObtenerDatosLaboratorio 
    @Horario_Hora_Inicio = '2024-07-01', 
    @Horario_Hora_Fin = '2024-07-01', 
    @Laboratorio_Ubicacion = 1, 
    @Laboratorio_Nombre = 'Lab Redes';

	select * from Laboratorio
	select * from Horario
-- Insertar datos en Horario
INSERT INTO Horario (Horario_Curso_ID, Horario_Laboratorio_ID, Horario_Dia_Semana, Horario_Hora_Inicio, Horario_Hora_Fin)
VALUES (1, 1, 'Lunes', '2023-01-01 08:00:00', '2023-01-01 10:00:00');

-- Insertar datos en Laboratorio
INSERT INTO Laboratorio (Laboratorio_Nombre, Laboratorio_Ubicacion, Laboratorio_Capacidad)
VALUES 
('Laboratorio 1', 1, 30);
EXEC sp_ObtenerDatosLaboratorio 
    @Horario_Hora_Inicio = '2023-01-01 08:00:00', 
    @Horario_Hora_Fin = '2023-01-01 10:00:00', 
    @Laboratorio_Ubicacion = 1, 
    @Laboratorio_Nombre = 'Laboratorio 1';


	SELECT * FROM Horario WHERE Horario_Hora_Inicio >= '2023-01-01 08:00:00' AND Horario_Hora_Fin <= '2023-01-01 10:00:00';
SELECT * FROM Laboratorio WHERE Laboratorio_Ubicacion = 1 AND Laboratorio_Nombre = 'Laboratorio 1';


DROP PROCEDURE IF EXISTS sp_ObtenerReporteLaboratorio;
GO

CREATE PROCEDURE sp_ObtenerReporteLaboratorio
AS
BEGIN
    SELECT 
        L.Laboratorio_ID,
        L.Laboratorio_Nombre,
        L.Laboratorio_Capacidad,
        C.Curso_Nombre,
        ISNULL(AVG(AST.Asistencia_Porcentaje), 0) AS Asistencia_Porcentaje,
        CASE
            WHEN AVG(AST.Asistencia_Porcentaje) >= 75 THEN 'Aprobado'
            ELSE 'Reprobado'
        END AS Asistencia_Estado,
        A.Alumno_Nombres,
        A.Alumno_Apellidos
    FROM 
        Laboratorio L
    INNER JOIN 
        Horario H ON L.Laboratorio_ID = H.Horario_Laboratorio_ID
    INNER JOIN 
        Curso C ON H.Horario_Curso_ID = C.Curso_ID
    LEFT JOIN 
        Asistencia AST ON H.Horario_ID = AST.Asistencia_Horario_ID
    LEFT JOIN 
        Alumno A ON AST.Asistencia_Alumno_ID = A.Alumno_Codigo
    GROUP BY 
        L.Laboratorio_ID,
        L.Laboratorio_Nombre,
        L.Laboratorio_Capacidad,
        C.Curso_Nombre,
        A.Alumno_Nombres,
        A.Alumno_Apellidos
    ORDER BY 
        L.Laboratorio_Nombre, C.Curso_Nombre, A.Alumno_Nombres;
END;
GO
