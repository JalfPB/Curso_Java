package Polimorfismo;

public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Myclass myClass = (MyClass) obj;
    return this.attribute == myClass.attribute;
}

public int hascode(){
    return Objects.hash(attribute);
}

protected Object clone() throws CloneNoteSupportedException{
    return super.clone();
}

public String toString() {
    return "MyClass{" +
            "attribute=" + attribute +
            '}';
}

public class EqualsYgetClass {

}
