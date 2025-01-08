package JuegoCombate;

abstract class Personaje {
    String nombre;
    int vida;
    int ataque;
    int defensa;
    int nivel;

    public Personaje(String nombre, int vida, int ataque, int defensa, int nivel) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.nivel = nivel;
    }

    abstract void atacar(Personaje enemigo);
    abstract void defender(int daño);
    abstract void curarse();
}



class Mago extends Personaje {
    public Mago(String nombre) {
        super(nombre, 80, 40, 10, 1);
    }

    @Override
    void atacar(Personaje enemigo) {
        int daño = this.ataque - enemigo.defensa;
        if (daño > 0) enemigo.defender(daño);
    }

    @Override
    void defender(int daño) {
        this.vida -= daño;
    }

    @Override
    void curarse() {
        this.vida += 15;
    }
}

class Arquero extends Personaje {
    public Arquero(String nombre) {
        super(nombre, 90, 25, 15, 1);
    }

    @Override
    void atacar(Personaje enemigo) {
        int daño = this.ataque - enemigo.defensa;
        if (daño > 0) enemigo.defender(daño);
    }

    @Override
    void defender(int daño) {
        this.vida -= daño;
    }

    @Override
    void curarse() {
        this.vida += 12;
    }

class Guerrero extends Personaje {
        public Guerrero(String nombre) {
            super(nombre, 100, 30, 20, 1);
        }
    
        @Override
        void atacar(Personaje enemigo) {
            int daño = this.ataque - enemigo.defensa;
            if (daño > 0) enemigo.defender(daño);
        }
    
        @Override
        void defender(int daño) {
            this.vida -= daño;
        }
    
        @Override
        void curarse() {
            this.vida += 10;
        }


    }
}

