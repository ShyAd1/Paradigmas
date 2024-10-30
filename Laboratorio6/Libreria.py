class Libro:
    def __init__(self,Titulo,Autor,ISBN,Estado):
        self.__Titulo = Titulo
        self.__Autor = Autor
        self.__ISBN = ISBN
        self.__Estado = Estado
        pass

    def setTitulo(self, n_Titulo):
        self.__Titulo = n_Titulo
    
    def setAutor(self, n_Autor):
        self.__Autor = n_Autor

    def setISBN(self, n_ISBN):
        self.__ISBN = n_ISBN

    def setEstado(self, n_Estado):
        self.__Estado = n_Estado

    def getTitulo(self):
        return self.__Titulo
    
    def getAutor(self):
        return self.__Autor
    
    def getISBN(self):
        return self.__ISBN
    
    def getEstado(self):
        return self.__Estado
    
    def getInfo(self):
        return f"El titulo del libro: {self.getTitulo()} \nDel autor: {self.getAutor()} \nCon ISBN: {self.getISBN()} \nTiene el estado: {self.getEstado()}"

L1 = Libro("La divina comedia", "Dante Alighieri", "dtb3r67mi870", "Disponible")

if __name__ == '__main__':
    print("Informacion del libro:\n")
    print(L1.getInfo())
    L1.setEstado("Prestado")
    print("Informacion del libro:\n")
    print(L1.getInfo())