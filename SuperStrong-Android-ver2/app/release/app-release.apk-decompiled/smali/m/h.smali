.class public final Lm/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lm/h;",
        ">;"
    }
.end annotation


# instance fields
.field public b:Z

.field public c:I

.field public d:I

.field public e:I

.field public f:F

.field public g:Z

.field public final h:[F

.field public final i:[F

.field public j:I

.field public k:[Lm/b;

.field public l:I

.field public m:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lm/h;->c:I

    iput v0, p0, Lm/h;->d:I

    const/4 v0, 0x0

    iput v0, p0, Lm/h;->e:I

    iput-boolean v0, p0, Lm/h;->g:Z

    const/16 v1, 0x9

    new-array v2, v1, [F

    iput-object v2, p0, Lm/h;->h:[F

    new-array v1, v1, [F

    iput-object v1, p0, Lm/h;->i:[F

    const/16 v1, 0x10

    new-array v1, v1, [Lm/b;

    iput-object v1, p0, Lm/h;->k:[Lm/b;

    iput v0, p0, Lm/h;->l:I

    iput v0, p0, Lm/h;->m:I

    iput p1, p0, Lm/h;->j:I

    return-void
.end method


# virtual methods
.method public final a(Lm/b;)V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lm/h;->l:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lm/h;->k:[Lm/b;

    aget-object v1, v1, v0

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lm/h;->k:[Lm/b;

    array-length v2, v0

    if-lt v1, v2, :cond_2

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lm/b;

    iput-object v0, p0, Lm/h;->k:[Lm/b;

    :cond_2
    iget-object v0, p0, Lm/h;->k:[Lm/b;

    iget v1, p0, Lm/h;->l:I

    aput-object p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lm/h;->l:I

    return-void
.end method

.method public final b(Lm/b;)V
    .locals 4

    iget v0, p0, Lm/h;->l:I

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    iget-object v2, p0, Lm/h;->k:[Lm/b;

    aget-object v2, v2, v1

    if-ne v2, p1, :cond_1

    :goto_1
    add-int/lit8 p1, v0, -0x1

    if-ge v1, p1, :cond_0

    iget-object p1, p0, Lm/h;->k:[Lm/b;

    add-int/lit8 v2, v1, 0x1

    aget-object v3, p1, v2

    aput-object v3, p1, v1

    move v1, v2

    goto :goto_1

    :cond_0
    iget p1, p0, Lm/h;->l:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lm/h;->l:I

    return-void

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final c()V
    .locals 6

    const/4 v0, 0x5

    iput v0, p0, Lm/h;->j:I

    const/4 v0, 0x0

    iput v0, p0, Lm/h;->e:I

    const/4 v1, -0x1

    iput v1, p0, Lm/h;->c:I

    iput v1, p0, Lm/h;->d:I

    const/4 v1, 0x0

    iput v1, p0, Lm/h;->f:F

    iput-boolean v0, p0, Lm/h;->g:Z

    iget v2, p0, Lm/h;->l:I

    move v3, v0

    :goto_0
    if-ge v3, v2, :cond_0

    iget-object v4, p0, Lm/h;->k:[Lm/b;

    const/4 v5, 0x0

    aput-object v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lm/h;->l:I

    iput v0, p0, Lm/h;->m:I

    iput-boolean v0, p0, Lm/h;->b:Z

    iget-object v0, p0, Lm/h;->i:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    return-void
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 1

    .line 1
    check-cast p1, Lm/h;

    .line 2
    .line 3
    iget v0, p0, Lm/h;->c:I

    .line 4
    .line 5
    iget p1, p1, Lm/h;->c:I

    .line 6
    .line 7
    sub-int/2addr v0, p1

    .line 8
    return v0
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
.end method

.method public final d(Lm/d;F)V
    .locals 3

    iput p2, p0, Lm/h;->f:F

    const/4 p2, 0x1

    iput-boolean p2, p0, Lm/h;->g:Z

    iget p2, p0, Lm/h;->l:I

    const/4 v0, -0x1

    iput v0, p0, Lm/h;->d:I

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, p2, :cond_0

    iget-object v2, p0, Lm/h;->k:[Lm/b;

    aget-object v2, v2, v1

    invoke-virtual {v2, p1, p0, v0}, Lm/b;->h(Lm/d;Lm/h;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    iput v0, p0, Lm/h;->l:I

    return-void
.end method

.method public final e(Lm/d;Lm/b;)V
    .locals 4

    iget v0, p0, Lm/h;->l:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_0

    iget-object v3, p0, Lm/h;->k:[Lm/b;

    aget-object v3, v3, v2

    invoke-virtual {v3, p1, p2, v1}, Lm/b;->i(Lm/d;Lm/b;Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iput v1, p0, Lm/h;->l:I

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lm/h;->c:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
