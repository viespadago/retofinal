import { useState, useEffect } from 'react';
import { data } from '../assets/data';
// import { Chart } from './Chart';
import { InfoDetails } from './InfoDetails';

import callToApi from '../services/api.js';

export const Dashboard = () => {
    const [user, setUser] = useState('Hackaton');
    const [requestedMoney, setRequestedMoney] = useState(0);
    const [acceptedRequests, setAcceptedRequests] = useState(0);
    const [budget, setBudget] = useState(0);
    const [loanReturnTime, setLoanReturnTime] = useState(0)

    const [data, setData] = useState([]);
    useEffect(() => {
        callToApi().then((data) => setData(data));
    }, []);
    console.log(data)
    return (
        <>
            <div>{data}</div>
            {/* */}
            <div className="info-container">
                <InfoDetails text="Users" number="109" />
                <InfoDetails text="Requested money" number="336507" />
                <InfoDetails text="Accepted requests" number="66" />
                <InfoDetails text="Loan time (day&hour)" number="37:19" />
                <InfoDetails text="Predicted budget" number="20000" />
                {/* <Chart /> */}
                {/* <div>{user}</div>
                <div>{requestedMoney}</div>
                <div>{acceptedRequests}</div>
                <div>{budget}</div>
                <div>{loanReturnTime}</div> */}
            </div>
        </>
    )
}

export default Dashboard;
