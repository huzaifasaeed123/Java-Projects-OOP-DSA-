
package testbook;

public class AudioBook extends Book
{
    private int playlenght,sizeMB;

    public AudioBook(int playlenght, int sizeMB, String title, String name, int yearpub) {
        super(title, name, yearpub);
        this.playlenght = playlenght;
        this.sizeMB = sizeMB;
    }

    
    public int getPlaylenght() {
        return playlenght;
    }

    public void setPlaylenght(int playlenght) {
        this.playlenght = playlenght;
    }

    public int getSizeMB() {
        return sizeMB;
    }

    public void setSizeMB(int sizeMB) {
        this.sizeMB = sizeMB;
    }
    
    @Override
    public String toString()
    {
        return String.format("%s\nPlaylenght:%d\nSize In MB:%d\n",super.toString(),this.getPlaylenght(),this.getSizeMB());
    }
    
    
}
