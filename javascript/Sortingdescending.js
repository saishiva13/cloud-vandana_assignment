// PromptSync package is used to take user input from the console
import PromptSync from "prompt-sync";
function sortInDesc(arr){
    return arr.sort((a,b) => b - a);
}
const prompt=PromptSync();
const arr = prompt();
const narr=arr.split(' ');


console.log("Result is", sortInDesc(narr));