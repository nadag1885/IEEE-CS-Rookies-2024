def convert_base(n, x):
    if n == 0:
        return '0'

    digits = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
    result = ''
    while n > 0:
        result = digits[n % x] + result
        n //= x
    return result

def base_conversion(t, n, x):
    if t == 1:
        # Convert from base X to decimal
        decimal_value = int(str(n), x)
        return decimal_value
    elif t == 2:
        # Convert from decimal to base X
        return convert_base(n, x)

t = int(input())
n, x = map(str, input().split())

n = int(n) if t == 2 else n
x = int(x)

result = base_conversion(t, n, x)

print(result)
