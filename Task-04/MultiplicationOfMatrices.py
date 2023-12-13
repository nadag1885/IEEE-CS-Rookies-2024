def multiply_matrices(matrixA, matrixB):
    rowsA = len(matrixA)
    colsA = len(matrixA[0])
    rowsB = len(matrixB)
    colsB = len(matrixB[0])

    if colsA != rowsB:
        return "Matrix multiplication not possible"

    result = [[0 for _ in range(colsB)] for _ in range(rowsA)]


    for i in range(rowsA):
        for j in range(colsB):
            for k in range(colsA):
                result[i][j] += matrixA[i][k] * matrixB[k][j]

    return result

# Reading matrix A
ra, ca = map(int, input().split())
matrixA = []
for _ in range(ra):
    row = list(map(int, input().split()))
    matrixA.append(row)

# Reading matrix B
rb, cb = map(int, input().split())
matrixB = []
for _ in range(rb):
    row = list(map(int, input().split()))
    matrixB.append(row)

# Performing matrix multiplication
result_matrix = multiply_matrices(matrixA, matrixB)

# Printing the result
if isinstance(result_matrix, str):
    print(result_matrix)
else:
    for row in result_matrix:
        print(*row)
