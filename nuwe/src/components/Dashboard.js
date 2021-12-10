import { useState } from 'react';
import { data } from '../assets/data';
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
            <div>
                <InfoDetails text="Users" number="200" />
                <InfoDetails text="Money" number="300" />
                <div>{user}</div>
                <div>{requestedMoney}</div>
                <div>{acceptedRequests}</div>
                <div>{budget}</div>
                <div>{loanReturnTime}</div>
            </div>
        </>
    )
}

export default Dashboard;
