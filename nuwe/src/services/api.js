// const callToApi = () => {
//     return fetch('/data.json')
//         .then(response => response.json())
//         .then(response => {
//             return response.results
//                 .map(item => {
//                     const result = {
//                         char: item.name,
//                         month: item.month,
//                         requestedMoney: item.requestedMoney

//                     }
//                     return result;
//                 })
//         });

// };


// export default callToApi;
import { data } from "./data"
export const calltoApi = () => {
    return data
}