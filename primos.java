    public  boolean Primo(int numero)
    {
      int cont = 2;
      boolean isPrimo=true;

      while ((isPrimo) && (cont!=numero) && (numero>cont)){
        if (numero % cont == 0)
          isPrimo = false;
        cont++;
      }
      return isPrimo;
    }

