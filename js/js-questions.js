// test to see what category a person will land on.

const openOrSenior = (data) =>{
    // create a empty variable to push the answer
    let results = [];

    // use a for-loop to iterate through a given array and check the index of the first and second,
    // if requrements are met then push a string of senior , if not then push a string of open into the array
    for (let i = 0; i < data.length; i++) {
        if (data[i][0] >= 55 && data[i][1] > 7) {
            results.push('Senior');
        } else {
            results.push('Open');
        }
    }
    return results;
}


console.log(openOrSenior([[18, 20], [45, 2], [61, 12], [37, 6], [21, 21], [78, 9]]));


// Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21
const diff21 = (number) => {
    let result;
    if (number === 0) {
        return 21;
    } else if (number < 21) {
        result = 21 - number;
        return result;

    } else if(number > 21) {
        result = number - 21;
        return result * 2;
    }
    return 0;
};

console.log(diff21(19));
console.log(diff21(10));
console.log(diff21(21));
