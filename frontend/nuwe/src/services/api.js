const callToApi = () => {
    return fetch('http://localhost:3000/total-money-users')
        .then(response => response.json())
        .then(response => {
             console.log(response)
                }
        );

};


export default callToApi;
// import { data } from "./data"
// export const calltoApi = () => {
//     return data
// }