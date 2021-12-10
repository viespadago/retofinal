import react from 'react';
import { useState } from 'react';
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