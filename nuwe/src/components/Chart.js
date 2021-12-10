// import React from 'react';
// import ReactECharts from 'echarts-for-react';

// const Chart: React.FC = () => {
//     const options = {
//         grid: { top: 8, right: 8, bottom: 24, left: 36 },
//         xAxis: {
//             type: 'category',
//             data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],
//         },
//         yAxis: {
//             type: 'value',
//         },
//         series: [
//             {
//                 data: [820, 932, 901, 934, 1290, 1330, 1320],
//                 type: 'line',
//                 smooth: true,
//             },
//         ],
//         tooltip: {
//             trigger: 'axis',
//         },
//     };

//     return <ReactECharts option={options} />;
// };

// export default Chart;

//import './App.css';
import '../../node_modules/react-vis/dist/style.css';
import { XYPlot, LineSeries, VerticalBarSeries, MarkSeries } from 'react-vis';
import React from 'react'

export const Chart = () => {
    const data = [
        { x: 15, y: 50 },
        { x: 1, y: 5 },
        { x: 2, y: 4 },
        { x: 3, y: 9 },
        { x: 4, y: 1 },
        { x: 5, y: 7 },
        { x: 6, y: 6 },
        { x: 7, y: 3 },
        { x: 8, y: 2 },
        { x: 9, y: 0 }
    ];
    return (
        <>
            <div className="App">
                <XYPlot height={200} width={200}>
                    <VerticalBarSeries data={data} />
                </XYPlot>
                {/* <XYPlot height={200} width={200}>
                    <LineSeries data={data} />
                </XYPlot> */}
                {/* <XYPlot height={200} width={200}>
                    <MarkSeries data={data} />
                </XYPlot> */}
            </div>
        </>
    )
};

