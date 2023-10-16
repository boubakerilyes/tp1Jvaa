public class Rectangle {
    float argeur;
    float  longeur;
    public Rectangle(float largeur, float longeur) {
        this.argeur = largeur;
        this.longeur = longeur;
    }
    float perimetre (){
        return (argeur+longeur)*2;
    }
    float Diagonale (){
        return (argeur*argeur)+(longeur*longeur);
    }
    float Doubler (){
        return longeur*longeur;
    }
}
