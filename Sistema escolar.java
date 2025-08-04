// Clase principal Colegio
public class Colegio {
    private String nombre;
    private String direccion;
    private List<Estudiante> estudiantes;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    public Colegio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new ArrayList<>();
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    // Getters y setters
    // ...
}

// Clase Estudiante
public class Estudiante {
    private int id;
    private String nombre;
    private int edad;

    public Estudiante(int id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Getters y setters
    // ...
}

// Clase Becado (herencia de Estudiante)
public class Becado extends Estudiante {
    private double porcentajeBeca;

    public Becado(int id, String nombre, int edad, double porcentajeBeca) {
        super(id, nombre, edad);
        this.porcentajeBeca = porcentajeBeca;
    }

    // Getters y setters
    // ...
}

// Clase Profesor
public class Profesor {
    private int id;
    private String nombre;
    private String especialidad;

    public Profesor(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    // Getters y setters
    // ...
}

// Clase ProfesorTitular (herencia de Profesor)
public class ProfesorTitular extends Profesor {
    private int antiguedad;

    public ProfesorTitular(int id, String nombre, String especialidad, int antiguedad) {
        super(id, nombre, especialidad);
        this.antiguedad = antiguedad;
    }

    // Getters y setters
    // ...
}

// Clase Departamento
public class Departamento {
    private String nombre;

    public Departamento(String nombre) {
        this.nombre = nombre;
    }

    // Getters y setters
    // ...
}

// Clase Curso (agregación con Departamento)
public class Curso {
    private String codigo;
    private String nombre;
    private String horario;
    private Departamento departamento;

    public Curso(String codigo, String nombre, String horario, Departamento departamento) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.horario = horario;
        this.departamento = departamento;
    }

    // Getters y setters
    // ...
}

// Clase principal para probar el sistema
public class Main {
    public static void main(String[] args) {
        // Crear colegio
        Colegio colegio = new Colegio("Colegio Ejemplo", "Calle Principal 123");
        
        // Crear departamento
        Departamento departamentoMate = new Departamento("Matemáticas");
        
        // Crear cursos
        Curso algebra = new Curso("MAT101", "Álgebra", "Lunes y Miércoles 8-10", departamentoMate);
        Curso calculo = new Curso("MAT102", "Cálculo", "Martes y Jueves 10-12", departamentoMate);
        
        // Crear profesores
        Profesor profe1 = new Profesor(1, "Juan Pérez", "Matemáticas");
        ProfesorTitular profeTitular = new ProfesorTitular(2, "Ana Gómez", "Matemáticas", 10);
        
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante(101, "Carlos López", 15);
        Becado estudianteBecado = new Becado(102, "María Sánchez", 16, 50.0);
        
        // Agregar elementos al colegio
        colegio.agregarCurso(algebra);
        colegio.agregarCurso(calculo);
        colegio.agregarProfesor(profe1);
        colegio.agregarProfesor(profeTitular);
        colegio.agregarEstudiante(estudiante1);
        colegio.agregarEstudiante(estudianteBecado);
        
        System.out.println("Sistema escolar configurado correctamente");
    }
}