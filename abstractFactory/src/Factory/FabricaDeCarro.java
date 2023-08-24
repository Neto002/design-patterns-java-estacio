package Factory;

import AbstractProduct.CarroPopular;
import AbstractProduct.CarroSedan;

public interface FabricaDeCarro {
    CarroSedan criaCarroSedan();
    CarroPopular criaCarroPopular();
}
