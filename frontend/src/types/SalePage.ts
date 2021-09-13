import { Sale } from "./Sale";

export type SalePage = {
    content: Sale[],
    last: boolean,
    totalElements: number,
    totalPages: number,
    number: number,
    size: number,
    first: boolean,
    numberOfElements: number,
    empty: boolean
}