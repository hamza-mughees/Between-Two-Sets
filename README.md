# Between Two Sets

Click [here](https://www.hackerrank.com/challenges/between-two-sets/problem) to view the problem on the HackerRank website

[![Run on Repl.it](https://repl.it/badge/github/hamza-mughees/Between-Two-Sets)](https://repl.it/github/hamza-mughees/Between-Two-Sets)

You will be given two arrays of integers and asked to determine all integers that satisfy the following two conditions:

The elements of the first array are all factors of the integer being considered
The integer being considered is a factor of all elements of the second array
These numbers are referred to as being between the two arrays. You must determine how many such numbers exist.

For example, given the arrays <img src="/tex/3cca52437305e66f9fe3cddbb821c0e0.svg?invert_in_darkmode&sanitize=true" align=middle width=63.48353384999998pt height=24.65753399999998pt/> and <img src="/tex/c9e3b7291098113cec447f888677796f.svg?invert_in_darkmode&sanitize=true" align=middle width=78.2875962pt height=24.65753399999998pt/>, there are two numbers between them: <img src="/tex/327c36301dc71617dc7032f8ce30b236.svg?invert_in_darkmode&sanitize=true" align=middle width=8.219209349999991pt height=21.18721440000001pt/> and <img src="/tex/d0b46deac7c0bf4f6285cbeb41067c88.svg?invert_in_darkmode&sanitize=true" align=middle width=16.438418699999993pt height=21.18721440000001pt/>. <img src="/tex/e061de791c9027d0966038df50aca402.svg?invert_in_darkmode&sanitize=true" align=middle width=60.273930749999984pt height=24.65753399999998pt/>, <img src="/tex/4f6769e1d2ac0c2908fd3e4e0699a88a.svg?invert_in_darkmode&sanitize=true" align=middle width=60.273930749999984pt height=24.65753399999998pt/>,  and <img src="/tex/fbe5eae93782b22dd163c698c857c15c.svg?invert_in_darkmode&sanitize=true" align=middle width=68.49314009999999pt height=24.65753399999998pt/> for the first value. Similarly, <img src="/tex/233ac0741f3d1bd690cb52b9578fa9a4.svg?invert_in_darkmode&sanitize=true" align=middle width=68.49314009999999pt height=24.65753399999998pt/>, <img src="/tex/a2ece1e3a8ae21655b0bd990d7b3298a.svg?invert_in_darkmode&sanitize=true" align=middle width=68.49314009999999pt height=24.65753399999998pt/> and <img src="/tex/ac4930f4024e9a2da53954bf2459042a.svg?invert_in_darkmode&sanitize=true" align=middle width=76.71234944999999pt height=24.65753399999998pt/>, <img src="/tex/e4817575598ff07ddedcbbe43835874a.svg?invert_in_darkmode&sanitize=true" align=middle width=76.71234944999999pt height=24.65753399999998pt/>.

**Function Description**

Complete the getTotalX function in the editor below. It should return the number of integers that are betwen the sets.

getTotalX has the following parameter(s):

- a: an array of integers
- b: an array of integers

**Input Format**

The first line contains two space-separated integers, <img src="/tex/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode&sanitize=true" align=middle width=9.86687624999999pt height=14.15524440000002pt/> and <img src="/tex/0e51a2dede42189d77627c4d742822c3.svg?invert_in_darkmode&sanitize=true" align=middle width=14.433101099999991pt height=14.15524440000002pt/>, the number of elements in array <img src="/tex/44bc9d542a92714cac84e01cbbb7fd61.svg?invert_in_darkmode&sanitize=true" align=middle width=8.68915409999999pt height=14.15524440000002pt/> and the number of elements in array <img src="/tex/4bdc8d9bcfb35e1c9bfb51fc69687dfc.svg?invert_in_darkmode&sanitize=true" align=middle width=7.054796099999991pt height=22.831056599999986pt/>.  
The second line contains <img src="/tex/55a049b8f161ae7cfeb0197d75aff967.svg?invert_in_darkmode&sanitize=true" align=middle width=9.86687624999999pt height=14.15524440000002pt/> distinct space-separated integers describing <img src="/tex/d6d0390c8972c686de739378984c0d2b.svg?invert_in_darkmode&sanitize=true" align=middle width=23.484827849999988pt height=24.65753399999998pt/> where <img src="/tex/47b09516931ac5804a75178523b31909.svg?invert_in_darkmode&sanitize=true" align=middle width=67.58457419999999pt height=21.68300969999999pt/>.  
The third line contains <img src="/tex/0e51a2dede42189d77627c4d742822c3.svg?invert_in_darkmode&sanitize=true" align=middle width=14.433101099999991pt height=14.15524440000002pt/> distinct space-separated integers describing <img src="/tex/add7a2956b2d9b4a3e6036218d87c35b.svg?invert_in_darkmode&sanitize=true" align=middle width=23.89766279999999pt height=24.65753399999998pt/> where <img src="/tex/d67e4fe1478b8f5bd86c2636c4326b45.svg?invert_in_darkmode&sanitize=true" align=middle width=74.1979887pt height=21.68300969999999pt/>.

**Constraints**

- <img src="/tex/2ed72e3604250fe22a374d89d04c1426.svg?invert_in_darkmode&sanitize=true" align=middle width=100.09874984999999pt height=21.18721440000001pt/>
- <img src="/tex/1302eb56258f5cb715c8d0ba6052a2d0.svg?invert_in_darkmode&sanitize=true" align=middle width=100.19692649999999pt height=24.65753399999998pt/>
- <img src="/tex/00f8b7d4db3788384d0ec1cf4394d972.svg?invert_in_darkmode&sanitize=true" align=middle width=100.60976145pt height=24.65753399999998pt/>

**Output Format**

Print the number of integers that are considered to be between <img src="/tex/44bc9d542a92714cac84e01cbbb7fd61.svg?invert_in_darkmode&sanitize=true" align=middle width=8.68915409999999pt height=14.15524440000002pt/> and <img src="/tex/4bdc8d9bcfb35e1c9bfb51fc69687dfc.svg?invert_in_darkmode&sanitize=true" align=middle width=7.054796099999991pt height=22.831056599999986pt/>.

**Sample Input**
```
2 3
2 4
16 32 96
```

**Sample Output**
```
3
```

**Explanation**

2 and 4 divide evenly into 4, 8, 12 and 16.  
4, 8 and 16 divide evenly into 16, 32, 96.

4, 8 and 16 are the only three numbers for which each element of a is a factor and each is a factor of all elements of b.
