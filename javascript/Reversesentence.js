// PromptSync package is used to take user input from the console
import PromptSync from "prompt-sync";
function reverseString(arr){
    let ans="";
    const newArr=arr.split(" ");
     for(var i=0;i<newArr.length;i++)
         ans+=newArr[i].split("").reverse().join("")+" ";
    return ans;
}
const prompt=PromptSync();
const arr = prompt();


console.log("Result is", reverseString(arr));