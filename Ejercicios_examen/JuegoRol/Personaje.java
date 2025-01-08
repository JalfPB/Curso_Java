package JuegoRol;

abstract class Personaje {
    String nombre;
    int nivel;
    int vida;
    int ataque;
    int defensa;

    public Personaje(String nombre, int nivel, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public abstract void atacar(Personaje enemigo);
    public abstract void defender();
}

class Guerrero extends Personaje {
    public Guerrero(String nombre) {
        super(nombre, 1, 100, 15, 10);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca con espada!");
        enemigo.vida -= this.ataque;
    }

    @Override
    public void defender() {
        System.out.println(nombre + " se defiende con escudo!");
        this.defensa += 5;
    }
}

class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, 1, 80, 10, 5);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " lanza un hechizo!");
        enemigo.vida -= this.ataque + 5;
    }

    @Override
    public void defender() {
        System.out.println(nombre + " invoca un escudo mágico!");
        this.defensa += 3;
    }
}

class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 1, 90, 12, 8);
    }

    @Override
    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " dispara una flecha!");
        enemigo.vida -= this.ataque;
    }

    @Override
    public void defender() {
        System.out.println(nombre + " esquiva el ataque!");
        this.defensa += 4;
    }
}