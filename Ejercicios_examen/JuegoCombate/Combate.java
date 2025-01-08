package JuegoCombate;

class Combate {
    Cola colaDeTurnos;
    Pila pilaDeAtaques;
    Territorio territorio;

    public Combate() {
        colaDeTurnos = new Cola();
        pilaDeAtaques = new Pila();
    }

    public void iniciarCombate(Personaje personaje1, Personaje personaje2, Territorio territorio) {
        colaDeTurnos.encolar(personaje1);
        colaDeTurnos.encolar(personaje2);
        this.territorio = territorio;

        while (!colaDeTurnos.isEmpty()) {
            Personaje atacante = colaDeTurnos.desencolar();
            Personaje defensor = colaDeTurnos.desencolar();

            // El atacante realiza su ataque
            atacante.atacar(defensor);
            pilaDeAtaques.apilar(atacante.nombre + " atacó a " + defensor.nombre);

            // Verificar si el defensor ha muerto
            if (defensor.vida <= 0) {
                // El atacante conquista el territorio
                territorio.conquistar();
                System.out.println(atacante.nombre + " ha conquistado el territorio: " + territorio.nombre);
                break;
            }

            // Los personajes alternan turnos
            colaDeTurnos.encolar(defensor);
            colaDeTurnos.encolar(atacante);
        }
    }
}