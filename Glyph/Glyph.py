class Glyph:
    def print(self):
        pass

class Line(Glyph):
    def __init__(self, elements):
        self.elements = elements

    def print(self):
        for element in self.elements:
            element.print()

class Char(Glyph):
    def __init__(self, c):
        self.c = c

    def print(self):
        print(self.c)

def main():
    c1 = Char('a')
    c2 = Char('b')
    
    elements = [c1, c2]
    
    l = Line(elements)
    l.print()

if __name__ == "__main__":
    main()
