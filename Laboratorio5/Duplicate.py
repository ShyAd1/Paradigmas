def dupli(array):
    tamanio = len(array)
    for i in range(tamanio):
        array[i] = array[i]*2


if __name__ == '__main__':
    arr = [5,3,6,7,1]
    print(arr)
    dupli(arr)
    print(arr)