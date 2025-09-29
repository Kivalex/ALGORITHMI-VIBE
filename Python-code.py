''' Hash таблица '''
table = {}
table["key1"] = "value1"
table["key2"] = "value2"
print(table["key1"])

''' Бинарная куча '''
import heapq

heap = []
heapq.heappush(heap, 3)
heapq.heappush(heap, 1)
heapq.heappush(heap, 2)
print(heap)  # [1, 3, 2]

''' Биноминальная куча '''
class BinomialHeap:
    def __init__(self):
        self.trees = []

heap = BinomialHeap()
print("BinomialHeap initialized")

''' Куча Фибоначчи '''
class FibHeap:
    def __init__(self):
        self.min = None
        self.nodes = []

heap = FibHeap()
print("Fibonacci Heap initialized")
