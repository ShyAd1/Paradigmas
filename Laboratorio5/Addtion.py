def dupli(array1, array2):
    tamanio1 = len(array1)
    array_resul = [0] * tamanio1

    for i in range(tamanio1):
            array_resul[i] = array1[i] + array2[i]

    return array_resul

if __name__ == '__main__':
    arr1 = [5,3,6,7,1]
    arr2 = [2,4,6,3,9]
    print(arr1)
    print(arr2)
    arr3 = dupli(arr1, arr2)
    print(arr3)