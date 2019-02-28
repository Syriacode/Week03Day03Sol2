package example.org.test.week03day03sol;

import android.os.Parcel;
import android.os.Parcelable;

public class Animal implements Parcelable {
    private String animalType;
    private String animalName;
    private String animalSound;
    private String animalImage;

    public Animal(){}

    public Animal(String animalType, String animalName, String animalSound, String animalImage) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalSound = animalSound;
        this.animalImage = animalImage;
    }

    protected Animal(Parcel in) {
        animalType = in.readString();
        animalName = in.readString();
        animalSound = in.readString();
        animalImage = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(animalType);
        dest.writeString(animalName);
        dest.writeString(animalSound);
        dest.writeString(animalImage);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                ", animalSound='" + animalSound + '\'' +
                ", animalImage='" + animalImage + '\'' +
                '}';
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalSound() {
        return animalSound;
    }

    public void setAnimalSound(String animalSound) {
        this.animalSound = animalSound;
    }

    public String getAnimalImage() {
        return animalImage;
    }

    public void setAnimalImage(String animalImage) {
        this.animalImage = animalImage;
    }
}
