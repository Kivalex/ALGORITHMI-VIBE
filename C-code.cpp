#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<string, string> table;
    table["key1"] = "value1";
    table["key2"] = "value2";
    cout << table["key1"];
}

// Бинарная куча 
#include <iostream>
#include <queue>
#include <vector>
using namespace std;

int main() {
    priority_queue<int, vector<int>, greater<int>> heap;
    heap.push(3);
    heap.push(1);
    heap.push(2);
    cout << heap.top(); // 1
}

// Биномиальная куча
#include <iostream>
using namespace std;

class BinomialHeap {
public:
    BinomialHeap() { cout << "BinomialHeap initialized\\n"; }
};

int main() {
    BinomialHeap heap;
}


// Куча Фибоначчи
#include <iostream>
using namespace std;

class FibHeap {
public:
    FibHeap() { cout << "Fibonacci Heap initialized\\n"; }
};

int main() {
    FibHeap heap;
}
