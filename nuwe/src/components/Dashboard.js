import { useState } from 'react';
import { data } from '../assets/data';
// import { Chart } from './Chart';
import { InfoDetails } from './InfoDetails';



export const Dashboard = () => {
    const [user, setUser] = useState('Hackaton');
    const [requestedMoney, setRequestedMoney] = useState(0);
    const [acceptedRequests, setAcceptedRequests] = useState(0);
    const [budget, setBudget] = useState(0);
    const [loanReturnTime, setLoanReturnTime] = useState(0)
    return (
        <>

            {/* */}
            <div className="info-container">
                <InfoDetails text="Users" number="200" />
                <InfoDetails text="Money" number="300" />
                <InfoDetails text="Requests" number="100" />
                <InfoDetails text="Time / hour" number="06:00:00" />
                <InfoDetails text="Budget (€)" number="20000" />
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
