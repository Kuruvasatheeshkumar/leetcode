class Solution {
public:
    int strStr(string haystack, string needle) {
         size_t pos = haystack.find(needle);
    if (pos == string::npos)
        return -1;
    else
        return pos;
}

int main() {
    string haystack = "sadbutsad";
    string needle = "sad";
    cout << strStr(haystack, needle) << endl;

    haystack = "leetcode";
    needle = "leeto";
    cout << strStr(haystack, needle) << endl; 

    return 0;
  }

};