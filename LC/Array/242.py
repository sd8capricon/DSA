def usingSorting(s: str, t: str):
    s = sorted(s)
    t = sorted(t)
    return s == t


def usingDict(s: str, t: str):
    count = {}

    for c in s:
        if c in count:
            count[c] += 1
        else:
            count[c] = 1

    for c in t:
        if c in count:
            count[c] -= 1
        else:
            count[c] = -1

    for val in count.values():
        if val != 0:
            return False

    return True


print(usingSorting("hello", "olleh"))
