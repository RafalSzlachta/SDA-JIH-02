package pl.sda;

import java.util.List;
import java.util.stream.Collectors;

public class DogService {

    DogDAO dogdao;

    public DogService(DogDAO dogdao) {
        this.dogdao = dogdao;
    }

    public List<Dog> getDogsOwnedBy(int id) {
        List<Dog> dogs = dogdao.getAllDogs().stream().filter(dog -> dog.owner_id == id).collect(Collectors.toList());
        return dogs;
    }

}
